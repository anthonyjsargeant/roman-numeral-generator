package uk.co.anthonysargeant.romannumerals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGenerator;
import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGeneratorImpl;

@Configuration
public class RomanNumeralsConfig {

    @Bean
    public RomanNumeralGenerator romanNumeralGenerator() {
        return new RomanNumeralGeneratorImpl();
    }
}
