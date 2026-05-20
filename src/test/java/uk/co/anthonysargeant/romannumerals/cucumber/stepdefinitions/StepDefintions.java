package uk.co.anthonysargeant.romannumerals.cucumber.stepdefinitions;

import io.cucumber.java.en.Given; // replaces lambda Given() from cucumber-java8 En interface (removed in Cucumber 7)
import io.cucumber.java.en.Then; // replaces lambda Then()
import io.cucumber.java.en.When; // replaces lambda When()
import io.cucumber.spring.CucumberContextConfiguration; // required by cucumber-spring 6+ to identify the Spring context holder
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import uk.co.anthonysargeant.romannumerals.cucumber.RomanNumeralsTestHelper;
import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGenerator;

import static org.hamcrest.MatcherAssert.assertThat; // replaces org.junit.Assert.assertThat (absent in JUnit 5)
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

@CucumberContextConfiguration // replaces implicit cucumber-java8 Spring wiring; marks this class as the Spring context config holder
@ContextConfiguration(classes = {CucumberConfiguration.class})
public class StepDefintions {

    @Autowired
    private RomanNumeralGenerator romanNumeralGenerator;

    @Autowired
    private RomanNumeralsTestHelper romanNumeralsTestHelper;

    @Given("^an integer of (\\d+)$") // replaces lambda: Given("...", (Integer number) -> ...)
    public void anIntegerOf(Integer number) {
        romanNumeralsTestHelper.setInputNumber(number);
    }

    @When("^we convert the integer to a Roman Numeral$") // replaces lambda: When("...", () -> ...)
    public void weConvertTheIntegerToARomanNumeral() {
        romanNumeralsTestHelper.setActualRomanNumeral(
                romanNumeralGenerator.generate(romanNumeralsTestHelper.getInputNumber()));
    }

    @Then("^the Roman Numerals Generator should return the numeral (.+)$") // replaces lambda: Then("...", (String s) -> ...)
    public void theRomanNumeralsGeneratorShouldReturnTheNumeral(String expectedRomanNumerals) {
        assertThat(romanNumeralsTestHelper.getActualRomanNumeral(), is(equalTo(expectedRomanNumerals)));
    }
}
