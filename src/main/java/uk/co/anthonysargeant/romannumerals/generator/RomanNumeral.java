package uk.co.anthonysargeant.romannumerals.generator;

public enum RomanNumeral {
    ONE("I"),
    FIVE("V"),
    TEN("X"),
    FIFTY("L"),
    HUNDRED("C"),
    FIVE_HUNDRED("D"),
    THOUSAND("M");

    private final String numeral;

    RomanNumeral(String numeral) {
        this.numeral = numeral;
    }

    public String numeral() {
        return numeral;
    }
}
