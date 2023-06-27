package com.appium.scripts;

import com.appium.pages.baseAppium;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class commons extends baseAppium {

    // FIND ELEMENT ----------------------------
    public static MobileElement findElementByXpath(String xpath) {
        try {
            int attempts = 0;
            boolean failed;
            do {
                try {
                    MobileElement element = (MobileElement) driver.findElement(By.xpath(xpath));
                    failed = false;
                    return element;
                } catch (Exception e) {
                    attempts++;
                    failed = true;
                }
            } while (attempts < 3 && failed);
            Assert.fail("Fail to find element: " + xpath);
            return null;
        } catch (Exception ignored) {
            Assert.fail("Fail to find element: " + xpath);
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PROPERTIES METHODS
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Properties getProperties(String propertiesFileName) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(System.getProperty("user.dir"), propertiesFileName)));
        } catch (FileNotFoundException e) {
            Assert.fail("File not found: " + propertiesFileName + ".\n" + e.getMessage());
        } catch (IOException e) {
            Assert.fail("Exception while reading: " + propertiesFileName + ".\n" + e.getMessage());
        }
        return properties;
    }

    // Long press
    public static void longPress(MobileElement element) {
        TouchAction action = new TouchAction(driver);
        Point location = element.getLocation();
        new TouchAction(driver).press(PointOption.point(location.getX(), location.getY())).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release().perform();
    }

    public static void doubleTap(MobileElement element) {
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        TouchAction action = new TouchAction(driver);

        action.tap(PointOption.point(x, y)).perform();
        action.tap(PointOption.point(x, y)).perform();
    }

    // SET TEXT

    // ELEMENT PRICE ORDER
    public static boolean isOrderedAscPrice(List<MobileElement>prices) {
        if (prices.isEmpty()) {
            return true; // Empty list is considered ordered 
        }
        Pattern pricePattern = Pattern.compile("\\$\\d+(\\.\\d{2})?"); // Regular expression for matching prices

        double previousPrice = extractPrice(prices.get(0).getText());

        for (int i = 1; i < prices.size(); i++) {
            double currentPrice = extractPrice(prices.get(i).getText());

            if (currentPrice < previousPrice) {
                return false; // Prices are not ordered
            }

            previousPrice = currentPrice;
        }

        return true; // All prices are ordered 
    }

    private static double extractPrice(String text) {
        Matcher matcher = Pattern.compile("\\$\\d+(\\.\\d{2})?").matcher(text);
        if (matcher.find()) {
            String priceString = matcher.group();
            return Double.parseDouble(priceString.substring(1));
        }
        return 0.0;
    }

    // ELEMENTS TEXT ORDER
    public boolean assertElementsInOrder(List<MobileElement>elements) {
        int size = elements.size();
        for (int i = 0; i < size - 1; i++) {
            String currentText = elements.get(i).getText();
            String nextText = elements.get(i + 1).getText();
            if (currentText.compareTo(nextText) > 0) {
                return false; // Elements are not in order
            }
        }
        return true; // Elements are in order
    }


}
