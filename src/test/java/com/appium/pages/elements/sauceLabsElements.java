package com.appium.pages.elements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class sauceLabsElements extends mobilePageObject {
    // HOME SCREEN

    @AndroidFindBy(accessibility = "open menu")
    public MobileElement HOME_SCREEN_BURGER_BUTTON;
}
