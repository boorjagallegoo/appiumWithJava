package com.appium.stepsDefinitions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;
import java.time.Duration;

import static com.appium.pages.baseAppium.getDriver;

public class mobilePageObject {

    protected mobilePageObject() {

        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public static MobileElement findElement(MobileElement element) {
        try {
            int attempts = 0;
            boolean failed;
            do {
                try {
                    failed = element.isDisplayed();
                    System.out.println("Driver(mobilePageObject): " + getDriver());
                    return element;
                } catch (Exception e) {
                    attempts++;
                    failed = false;
                    System.out.println("Retry find element:" + element);
                }
            } while (attempts < 3 && !failed);
            Assert.fail("Fail to find element: " + element);
            return null;
        } catch (Exception ignored) {
            Assert.fail("Fail to find element: " + element);
            return null;
        }
    }

    public static void click(MobileElement element) {
        try {
            //element.click();
            findElement(element).click();
        } catch (NoSuchElementException e) {
            Assert.fail("Fail to click on element: " + element);
        }
    }

    /**
     * Long pressing for a period of times
     *
     * @param element     MobileElement
     * @param timePressed times while pressing element in SECONDS
     */
    public void longPress(MobileElement element, int timePressed) {
        AndroidTouchAction touch = new AndroidTouchAction(getDriver());
        System.out.println("LongPressing [" + element.toString() + "]");
        touch.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(element)).withDuration(Duration.ofSeconds(timePressed)))
                        .release().perform();
    }

    /**
     * Double click on element
     *
     * @param element MobileElement
     */
    // by Carlos
    public void doubleClick(MobileElement element) {

        int x = element.getLocation().getX() + element.getSize().getWidth() / 2;
        int y = element.getLocation().getY() + element.getSize().getHeight() / 2;

        ((JavascriptExecutor) BSAppium.getDriver()).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", (element).getId(),
                "endX", x,
                "endY", y
        ));
    }

    public static void setText(MobileElement element, String text) {
        try {
            // element.clear();
            // element.sendKeys(text);
            findElement(element).clear();
            findElement(element).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Fail to set text on element:" + element);
        }
    }

    public static String getTextElement(MobileElement element) {
        try {
            return findElement(element).getText();
            // return element.getText();
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + element);
            return null;
        }
    }

    public static boolean isPresent(MobileElement element) {
        try {
            boolean presence = element.isDisplayed();
            return presence;
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + element);
            return false;
        }
    }

    public static Boolean verifyElementHasText(MobileElement element, String text) {
        return getTextElement(element).equals(text);
    }
}