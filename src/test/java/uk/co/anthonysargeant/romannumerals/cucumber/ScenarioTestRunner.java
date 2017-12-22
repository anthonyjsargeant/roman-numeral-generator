package uk.co.anthonysargeant.romannumerals.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"uk.co.anthonysargeant.romannumerals.cucumber.stepdefinitions"},
        features = {"src/test/resources/features/roman-numerals.feature"},
        tags = {"not @Ignore"}
)
public class ScenarioTestRunner {
}
