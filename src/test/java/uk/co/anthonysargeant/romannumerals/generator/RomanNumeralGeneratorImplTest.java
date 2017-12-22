package uk.co.anthonysargeant.romannumerals.generator;

import org.junit.Before;
import org.junit.Test;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGeneratorImpl.MAX_VALUE;

public class RomanNumeralGeneratorImplTest {

    private RomanNumeralGenerator romanNumeralGenerator;

    @Before
    public void setUp() {
        romanNumeralGenerator = new RomanNumeralGeneratorImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfInputIsGreaterThan3999() {
        romanNumeralGenerator.generate(MAX_VALUE + 1);
    }

    @Test
    public void shouldReturnEmptyStringIfInputIsZero() {
        assertRomanNumeralConversionIsCorrect(0, EMPTY);
    }

    @Test
    public void shouldConvertTheIntegerOne() {
        assertRomanNumeralConversionIsCorrect(1, "I");
    }

    @Test
    public void shouldConvertTheIntegerTwo() {
        assertRomanNumeralConversionIsCorrect(2, "II");
    }

    @Test
    public void shouldConvertTheIntegerThree() {
        assertRomanNumeralConversionIsCorrect(3, "III");
    }

    @Test
    public void shouldConvertTheIntegerFour() {
        assertRomanNumeralConversionIsCorrect(4, "IV");
    }

    @Test
    public void shouldConvertTheIntegerFive() {
        assertRomanNumeralConversionIsCorrect(5, "V");
    }

    @Test
    public void shouldConvertTheIntegerSix() {
        assertRomanNumeralConversionIsCorrect(6, "VI");
    }

    @Test
    public void shouldConvertTheIntegerSeven() {
        assertRomanNumeralConversionIsCorrect(7, "VII");
    }

    @Test
    public void shouldConvertTheIntegerEight() {
        assertRomanNumeralConversionIsCorrect(8, "VIII");
    }

    @Test
    public void shouldConvertTheIntegerNine() {
        assertRomanNumeralConversionIsCorrect(9, "IX");
    }

    @Test
    public void shouldConvertTheIntegerTen() {
        assertRomanNumeralConversionIsCorrect(10, "X");
    }

    @Test
    public void shouldConvertArbitraryInteger() {
        assertRomanNumeralConversionIsCorrect(1977, "MCMLXXVII");
    }

    private void assertRomanNumeralConversionIsCorrect(int inputNumber, String expectedRomanNumerals) {
        String actualRomanNumerals = romanNumeralGenerator.generate(inputNumber);
        assertThat(actualRomanNumerals, is(equalTo(expectedRomanNumerals)));
    }
}