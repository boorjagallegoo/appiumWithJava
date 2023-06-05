package com.appium.stepsDefinitions.confluedentStepsDefs;

import com.appium.pages.confluedentScreens.loginScreen;
import com.appium.scripts.commons;
import com.appium.scripts.configuration;
import com.appium.stepsDefinitions.commonsSteps;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Properties;

public class loginScreenSteps {
    // PROPERTIES
    public static Properties keyProperties = configuration.KEY_PROPERTIES_FILE("Confluedent");

    @When("^the user logins with mail '(.*)' and password '(.*)'$")
    public static void userLogin(String mail, String pass) {
        loginScreen.userEnterCredentials(mail, pass);
    }

    @When("^the user click to login button$")
    public static void clickLoginButton() {
        loginScreen.clickToLoginButton();
    }

    @When("^the user click to recovery pass button$")
    public static void clickRecoveryPassButton() {
        loginScreen.clickToRecoveryPassButton();
    }

    @When("^the user click to sign up button$")
    public static void clickSignUpButton() {
        loginScreen.clickToSignUpButton();
    }

    @Then("^a message displayed with the text '(.*)'$")
    public static void verifyMessage(String key) {
        String message = keyProperties.getProperty(key);
        Assert.assertTrue("The message has not been found containing: " + key, loginScreen.verifyMessageText(message));
    }
}
