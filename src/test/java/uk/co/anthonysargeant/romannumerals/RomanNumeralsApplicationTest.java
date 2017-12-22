package uk.co.anthonysargeant.romannumerals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGeneratorImpl;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class RomanNumeralsApplicationTest {

    @Spy
    private RomanNumeralGeneratorImpl romanNumeralGenerator;

    private RomanNumeralsApplication romanNumeralsApplication;

    @Before
    public void setUp() {
        romanNumeralsApplication = new RomanNumeralsApplication(romanNumeralGenerator);
    }

    @Test
    public void shouldGenerateRomanNumeral() throws Exception {
        String[] input = {"32"};
        romanNumeralsApplication.run(input);
        verify(romanNumeralGenerator).generate(Integer.parseInt(input[0]));
    }

    @Test
    public void shouldIgnoreNonNumericInput() throws Exception {
        String[] input = {"abcdef"};
        romanNumeralsApplication.run(input);
        verify(romanNumeralGenerator, never()).generate(anyInt());
    }

    @Test
    public void shouldIgnoreMultipleInputs() throws Exception {
        String[] input = {"22", "33"};
        romanNumeralsApplication.run(input);
        verify(romanNumeralGenerator, never()).generate(anyInt());
    }
}