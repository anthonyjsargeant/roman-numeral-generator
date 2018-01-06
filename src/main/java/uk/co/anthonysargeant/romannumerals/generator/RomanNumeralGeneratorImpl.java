package uk.co.anthonysargeant.romannumerals.generator;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static uk.co.anthonysargeant.romannumerals.generator.RomanNumeral.*;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {
    static int MAX_VALUE = 3999;

    @Override
    public String generate(int number) {
        if (number > MAX_VALUE) {
            throw new IllegalArgumentException("Numbers over 3999 are not supported.");
        }

        int thousands =  number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;
        return repeat(thousands, THOUSAND.numeral())
                + repeat(hundreds, HUNDRED.numeral(), FIVE_HUNDRED.numeral(), THOUSAND.numeral())
                + repeat(tens, TEN.numeral(), FIFTY.numeral(), HUNDRED.numeral())
                + repeat(units, ONE.numeral(), FIVE.numeral(), TEN.numeral());
    }

    private String repeat(int number, String numeral) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(numeral);
        }
        return sb.toString();
    }

    private String repeat(int number, String lowerNumeral, String middleNumeral, String higherNumeral ) {
        if (number < 4) {
            return repeat(number, lowerNumeral);
        } else if (number == 4) {
            return lowerNumeral + middleNumeral;
        } else if (number < 9) {
            return middleNumeral + repeat(number - 5, lowerNumeral);
        } else if (number == 9) {
            return lowerNumeral + higherNumeral;
        } else {
            return EMPTY;
        }
    }
}
