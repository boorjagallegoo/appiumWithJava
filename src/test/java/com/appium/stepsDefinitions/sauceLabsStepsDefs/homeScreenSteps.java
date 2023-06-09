package com.appium.stepsDefinitions.sauceLabsStepsDefs;

import com.appium.pages.sauceLabsScreens.homeScreen;
import io.cucumber.java.en.When;

public class homeScreenSteps {

    @When("the user click to burger button")
    public static void clickBurger() {
        homeScreen.burgerButton();
    }
}
