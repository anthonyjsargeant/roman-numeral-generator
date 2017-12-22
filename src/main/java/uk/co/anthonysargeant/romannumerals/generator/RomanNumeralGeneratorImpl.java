package uk.co.anthonysargeant.romannumerals.generator;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class RomanNumeralGeneratorImpl implements RomanNumeralGenerator {
    static int MAX_VALUE = 3999;

    private static final String ONE = "I";
    private static final String FIVE = "V";
    private static final String TEN = "X";
    private static final String FIFTY = "L";
    private static final String HUNDRED = "C";
    private static final String FIVE_HUNDRED = "D";
    private static final String THOUSAND = "M";

    @Override
    public String generate(int number) {
        if (number > MAX_VALUE) {
            throw new IllegalArgumentException("Numbers over 3999 are not supported.");
        }

        int thousands =  number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;
        return repeat(thousands, THOUSAND)
                + repeat(hundreds, HUNDRED, FIVE_HUNDRED, THOUSAND)
                + repeat(tens, TEN, FIFTY, HUNDRED)
                + repeat(units, ONE, FIVE, TEN);
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
