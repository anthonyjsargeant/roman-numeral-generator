package uk.co.anthonysargeant.romannumerals.cucumber.stepdefinitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import uk.co.anthonysargeant.romannumerals.cucumber.RomanNumeralsTestHelper;
import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGenerator;

import cucumber.api.java8.En;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@ContextConfiguration(classes = {CucumberConfiguration.class})
public class StepDefintions implements En {

    @Autowired
    private RomanNumeralGenerator romanNumeralGenerator;

    @Autowired
    private RomanNumeralsTestHelper romanNumeralsTestHelper;

    public StepDefintions() {

        Given("^an integer of (\\d+)$",
                (Integer number) -> romanNumeralsTestHelper.setInputNumber(number));

        When("^we convert the integer to a Roman Numeral$",
                () -> romanNumeralsTestHelper.setActualRomanNumeral(romanNumeralGenerator.generate(romanNumeralsTestHelper.getInputNumber())));

        Then("^the Roman Numerals Generator should return the numeral (.+)$",
                (String expectedRomanNumerals) -> assertThat(romanNumeralsTestHelper.getActualRomanNumeral(), is(equalTo(expectedRomanNumerals))));
    }
}
