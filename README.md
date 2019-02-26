# Roman Numeral Generator
[![DepShield Badge](https://depshield.sonatype.org/badges/anthonyjsargeant/roman-numeral-generator/depshield.svg)](https://depshield.github.io)

This is a simple Spring Boot command line application that will return you a Roman Numeral for a given integer input.

**NB:** Only single integers between 1 and 3999 (inclusive) are supported. Any other input will result in an error message. See examples below.

## Building the app
To build the app, simply run the following command at the terminal:

```text
./mvnw clean install -Pintegration-test
```

This will then build an executable `jar` artifact in the `target` directory called `roman-numerals-1.0.jar`.

### Running the app
Either place the above named file in your path, or `cd` into the target directory and run the app as per the examples below:
```text
./roman-numerals-1.0.jar 1
1 => I
```
```text
./roman-numerals-1.0.jar 5
5 => V
```
```text
./roman-numerals-1.0.jar 10
10 => X
```
```text
./roman-numerals-1.0.jar 2018
2018 => MMXVIII
```
Examples of a unsupported input is given below:
```text
./roman-numerals-1.0.jar 0   
IllegalArgumentException: Numbers less than 1 are not supported.
```
```text
./roman-numerals-1.0.jar 4000
IllegalArgumentException: Numbers over 3999 are not supported.
```
```text
./roman-numerals-1.0.jar 1.2
The Roman Numerals Generator can only convert numbers (integers)!
```
```text
./roman-numerals-1.0.jar roman
The Roman Numerals Generator can only convert numbers (integers)!
```
```text
./roman-numerals-1.0.jar 1 23 
The Roman Numerals Generator can only convert a single number!
```
