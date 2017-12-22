Feature: Roman Numerals Generator
  Scenario: The one where we convert an integer at the bottom of the specified range
    Given an integer of 1
    When we convert the integer to a Roman Numeral
    Then the Roman Numerals Generator should return the numeral I

  Scenario: The one where we convert a single digit integer into Roman Numerals
    Given an integer of 5
    When we convert the integer to a Roman Numeral
    Then the Roman Numerals Generator should return the numeral V

  Scenario: The one where we convert an integer with multiple digits to a single digit Roman Numeral
    Given an integer of 10
    When we convert the integer to a Roman Numeral
    Then the Roman Numerals Generator should return the numeral X

  Scenario: The one where we convert an integer with multiple digits to a Roman Numeral with multiple digits
    Given an integer of 20
    When we convert the integer to a Roman Numeral
    Then the Roman Numerals Generator should return the numeral XX

  Scenario: The one where we convert an integer at the top of the specified range
    Given an integer of 3999
    When we convert the integer to a Roman Numeral
    Then the Roman Numerals Generator should return the numeral MMMCMXCIX