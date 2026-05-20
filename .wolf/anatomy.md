# anatomy.md

> Auto-maintained by OpenWolf. Last scanned: 2026-05-20T10:54:33.028Z
> Files: 24 tracked | Anatomy hits: 0 | Misses: 0

## ./

- `.gitignore` — Git ignore rules (~67 tok)
- `CLAUDE.md` — OpenWolf (~57 tok)
- `LICENSE` — Project license (~287 tok)
- `mvnw` — or more contributor license agreements.  See the NOTICE file (~1725 tok)
- `mvnw.cmd` (~1332 tok)
- `pom.xml` — Maven project configuration (~1400 tok)
- `README.md` — Project documentation (~403 tok)

## .claude/

- `settings.json` (~441 tok)

## .claude/rules/

- `openwolf.md` (~313 tok)

## .mvn/wrapper/

- `maven-wrapper.jar` (~12158 tok)
- `maven-wrapper.properties` (~30 tok)

## src/main/java/uk/co/anthonysargeant/romannumerals/

- `RomanNumeralsApplication.java` — RomanNumeralsApplication: main, run (~499 tok)

## src/main/java/uk/co/anthonysargeant/romannumerals/config/

- `RomanNumeralsConfig.java` — Configuration: RomanNumeralsConfig (~143 tok)

## src/main/java/uk/co/anthonysargeant/romannumerals/generator/

- `RomanNumeral.java` — RomanNumeral: numeral (~107 tok)
- `RomanNumeralGenerator.java` — RomanNumeralGenerator: generate (~40 tok)
- `RomanNumeralGeneratorImpl.java` — RomanNumeralGeneratorImpl: generate (~560 tok)

## src/main/resources/

- `application.properties` (~7 tok)

## src/test/java/uk/co/anthonysargeant/romannumerals/

- `RomanNumeralsApplicationTest.java` — RomanNumeralsApplicationTest: setUp, shouldGenerateRomanNumeral, shouldIgnoreNonNumericInput, shouldIgnoreMultipleInputs (~416 tok)

## src/test/java/uk/co/anthonysargeant/romannumerals/cucumber/

- `RomanNumeralsTestHelper.java` — RomanNumeralsTestHelper: getInputNumber, setInputNumber, getActualRomanNumeral, setActualRomanNumeral (~156 tok)
- `ScenarioTestRunner.java` — Class: ScenarioTestRunner (~132 tok)

## src/test/java/uk/co/anthonysargeant/romannumerals/cucumber/stepdefinitions/

- `CucumberConfiguration.java` — CucumberConfiguration: romanNumeralGenerator, romanNumeralsApplication, romanNumeralsTestHelper (~260 tok)
- `StepDefintions.java` — Class: StepDefintions (~391 tok)

## src/test/java/uk/co/anthonysargeant/romannumerals/generator/

- `RomanNumeralGeneratorImplTest.java` — RomanNumeralGeneratorImplTest: setUp, shouldThrowExceptionIfInputIsGreaterThan3999, shouldThrowExceptionIfInputIsLessThanOne, shouldConvertTheInteg... (~840 tok)

## src/test/resources/features/

- `roman-numerals.feature` (~327 tok)
