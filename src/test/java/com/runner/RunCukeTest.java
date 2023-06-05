package com.runner;

import com.appium.pages.baseAppium;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        //tags = "@clockApp",
        glue = {
                "com/appium/stepsDefinitions",
                "com/appium/stepsDefinitions/confluedentStepsDefs",
                "com/appium/stepsDefinitions/clockStepsDefs"
        },
        plugin = {"json:test-reports/cucumber-report/cucumber.json", "rerun:test-reports/rerun/rerun.txt"},
        monochrome = true
)

public class RunCukeTest {
    static baseAppium appiumService = new baseAppium();

    @AfterClass
    public static void stopAppiumServer() {
        appiumService.tearDown();
    }
}
