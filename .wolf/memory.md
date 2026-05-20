# Memory

> Chronological action log. Hooks and AI append to this file automatically.
> Old sessions are consolidated by the daemon weekly.

## Session: 2026-05-20 11:55

| Time | Action | File(s) | Outcome | ~Tokens |
|------|--------|---------|---------|--------|

## Session: 2026-05-20 12:43

| Time | Action | File(s) | Outcome | ~Tokens |
|------|--------|---------|---------|--------|
| 12:55 | Created pom.xml | — | ~1559 |
| 12:55 | Edited .mvn/wrapper/maven-wrapper.properties | inline fix | ~30 |
| 12:56 | Edited pom.xml | inline fix | ~31 |

## Session: 2026-05-20 11:56 (Java 21 migration)

| Time | Action | File(s) | Outcome | ~Tokens |
|------|--------|---------|---------|--------|
| 11:56 | Java 21 Phase 1 assessment | pom.xml, source files | Migration plan produced | ~3000 |
| 11:56 | Java 21 Phase 2 build config | pom.xml, maven-wrapper.properties | Spring Boot 1.5→3.2.5, Cucumber 2.3→7.15, JUnit 4 deps removed, Maven 3.5→3.9.6, compiler plugin updated; dependencies resolved clean | ~1600 |
| 12:56 | Session end: 3 writes across 2 files (pom.xml, maven-wrapper.properties) | 9 reads | ~5568 tok |
| 12:58 | Created src/test/java/uk/co/anthonysargeant/romannumerals/generator/RomanNumeralGeneratorImplTest.java | — | ~922 |
| 12:58 | Created src/test/java/uk/co/anthonysargeant/romannumerals/RomanNumeralsApplicationTest.java | — | ~487 |
| 12:59 | Created src/test/java/uk/co/anthonysargeant/romannumerals/cucumber/ScenarioTestRunner.java | — | ~328 |
| 12:59 | Created src/test/java/uk/co/anthonysargeant/romannumerals/cucumber/stepdefinitions/StepDefintions.java | — | ~572 |
| 13:06 | Java 21 Phase 3 complete: mvn test | all 4 test files | 16/16 unit tests pass on Java 21 | ~2000 |
| 13:06 | Session end: 7 writes across 6 files (pom.xml, maven-wrapper.properties, RomanNumeralGeneratorImplTest.java, RomanNumeralsApplicationTest.java, ScenarioTestRunner.java) | 10 reads | ~8881 tok |
| 13:08 | Session end: 7 writes across 6 files (pom.xml, maven-wrapper.properties, RomanNumeralGeneratorImplTest.java, RomanNumeralsApplicationTest.java, ScenarioTestRunner.java) | 10 reads | ~8881 tok |
