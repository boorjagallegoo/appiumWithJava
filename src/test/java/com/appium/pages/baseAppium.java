package com.appium.pages;

import com.utils.PropertyLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class baseAppium {

    public static AppiumDriver driver;

    public void init(String propertieFile) throws MalformedURLException {
        switch (System.getProperty("deviceType")){
            case "emulator":
                System.out.println("----- Emulator device type selected -----");
                switch (System.getProperty("platform")){
                    case "android":
                        System.out.println("----- Android platform selected -----");
                        androidEmulator(propertieFile);
                        break;
                    case "ios":
                        System.out.println("----- IOS platform selected -----");
                        break;
                }
        }
    }

    public static void androidEmulator(String propertieFile) throws MalformedURLException{
        //Property loader
        PropertyLoader loadproperty = new PropertyLoader();
        String propertiesFile = "params" + propertieFile + ".properties";

        //Desire capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, loadproperty.loadProperties(propertiesFile).getProperty("platformName"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, loadproperty.loadProperties(propertiesFile).getProperty("androidAutomationName"));
        capabilities.setCapability("appActivity", loadproperty.loadProperties(propertiesFile).getProperty("appActivity"));//.AuthActivity
        capabilities.setCapability("appPackage", loadproperty.loadProperties(propertiesFile).getProperty("appPackage"));//com.example.confluedent
        //capabilities.setCapability("abdExecTimeout", 3000);
        capabilities.setCapability(MobileCapabilityType.UDID, loadproperty.loadProperties(propertiesFile).getProperty("androidUdid"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, loadproperty.loadProperties(propertiesFile).getProperty("androidDeviceName"));
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);

        File app = new File(loadproperty.loadProperties(propertiesFile).getProperty("apkDir"), loadproperty.loadProperties(propertiesFile).getProperty("apkName"));
        capabilities.setCapability("app", app.getAbsolutePath());

        //Init driver
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        System.out.println("Application stated....");
        System.out.println("Driver(BaseAppium): " + driver);
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    public void resetApp() {
        driver.resetApp();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
