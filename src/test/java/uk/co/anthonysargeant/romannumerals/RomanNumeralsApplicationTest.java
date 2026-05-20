package uk.co.anthonysargeant.romannumerals;

import org.junit.jupiter.api.BeforeEach; // replaces org.junit.Before (JUnit 4 removed in Boot 3)
import org.junit.jupiter.api.Test; // replaces org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith; // replaces org.junit.runner.RunWith (JUnit 4)
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension; // replaces MockitoJUnitRunner (removed in Mockito 3)

import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGeneratorImpl;

import static org.mockito.ArgumentMatchers.anyInt; // replaces org.mockito.Matchers (removed in Mockito 3)
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class) // replaces @RunWith(MockitoJUnitRunner.class)
public class RomanNumeralsApplicationTest {

    @Spy
    private RomanNumeralGeneratorImpl romanNumeralGenerator;

    private RomanNumeralsApplication romanNumeralsApplication;

    @BeforeEach // replaces @Before
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
