package uk.co.anthonysargeant.romannumerals.cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite // replaces @RunWith(Cucumber.class) — JUnit 5 Platform Suite
@IncludeEngines("cucumber") // activates the Cucumber JUnit Platform engine
@SelectClasspathResource("features") // replaces features = {"src/test/resources/features/..."} in @CucumberOptions
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "uk.co.anthonysargeant.romannumerals.cucumber.stepdefinitions") // replaces glue in @CucumberOptions
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") // replaces plugin = {"pretty"} in @CucumberOptions
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "not @Ignore") // replaces tags = {"not @Ignore"} in @CucumberOptions
public class ScenarioTestRunner {
}
