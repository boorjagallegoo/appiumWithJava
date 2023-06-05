package com.hooks;

import com.appium.pages.baseAppium;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {
    String featureTag;
    long start = System.currentTimeMillis();

    @Before
    public void beforeFeature(Scenario scenario) throws IOException {
        featureTag = scenario.getSourceTagNames().toString();
    }


    @After
    public void afterScenario() throws IOException {
        baseAppium.getDriver().quit();
        long stop = System.currentTimeMillis();
        long actualTimeMinutes = (TimeUnit.MILLISECONDS.toSeconds(stop - start)) / 60;
        long actualTimeSeconds = (TimeUnit.MILLISECONDS.toSeconds(stop - start)) % 60;
        System.out.println(featureTag + " - Actual scenario execution time: " + actualTimeMinutes + "min " + actualTimeSeconds + "s");

    }
}
