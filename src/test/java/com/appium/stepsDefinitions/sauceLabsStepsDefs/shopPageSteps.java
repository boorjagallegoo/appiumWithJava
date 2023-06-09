package com.appium.stepsDefinitions.sauceLabsStepsDefs;

import com.appium.pages.sauceLabsScreens.shopScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shopPageSteps {

    @When("^Click on the (.*) you want, for the text.$")
    public void genericClickItem(String item) {
        shopScreen.genericClickItem(item);
    }

    @And("^Choose the (.*) if you can, otherwise leave the default color if there is one.$")
    public void selectColorItem(String item) {
        shopScreen.selectColorItem(item);
    }

    @And("^Add a certain (.*) of products.$")
    public void addTheSameItem(String item) {
        shopScreen.addTheSameItem(item);
    }

    @Then("^Check that the (.*) of products is correct.$")
    public void checkCart(String item) {
        shopScreen.checkCart(item);
    }

}
