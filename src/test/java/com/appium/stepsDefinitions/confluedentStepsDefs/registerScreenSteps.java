package com.appium.stepsDefinitions.confluedentStepsDefs;

import com.appium.pages.confluedentScreens.singUpScreen;
import io.cucumber.java.en.When;

public class registerScreenSteps {
    @When("^the user fills in the fields$")
    public static void fillRegisterFields() {
        singUpScreen.fillsFields();
    }

    @When("^the user click to save button$")
    public static void clickToSaveButton() {
        singUpScreen.clickToRegisterButton();
    }
}
