package com.appium.pages.sauceLabsScreens;

import com.appium.pages.elements.sauceLabsElements;

public class homeScreen extends sauceLabsElements {
public static sauceLabsElements homeElements = new sauceLabsElements();
    public static void burgerButton() {
        click(homeElements.HOME_SCREEN_BURGER_BUTTON);
    }
}
