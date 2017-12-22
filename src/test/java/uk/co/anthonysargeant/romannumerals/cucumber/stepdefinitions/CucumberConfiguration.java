package uk.co.anthonysargeant.romannumerals.cucumber.stepdefinitions;

import org.springframework.context.annotation.Bean;

import uk.co.anthonysargeant.romannumerals.RomanNumeralsApplication;
import uk.co.anthonysargeant.romannumerals.cucumber.RomanNumeralsTestHelper;
import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGenerator;
import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGeneratorImpl;

public class CucumberConfiguration {
    @Bean
    public RomanNumeralGenerator romanNumeralGenerator() {
        return new RomanNumeralGeneratorImpl();
    }

    @Bean
    public RomanNumeralsApplication romanNumeralsApplication(RomanNumeralGenerator romanNumeralsGenerator) {
        return new RomanNumeralsApplication(romanNumeralsGenerator);
    }

    @Bean
    public RomanNumeralsTestHelper romanNumeralsTestHelper() {
        return new RomanNumeralsTestHelper();
    }
}
