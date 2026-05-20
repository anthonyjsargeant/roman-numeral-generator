# Cerebrum

> OpenWolf's learning memory. Updated automatically as the AI learns from interactions.
> Do not edit manually unless correcting an error.
> Last updated: 2026-05-20

## User Preferences

<!-- How the user likes things done. Code style, tools, patterns, communication. -->

## Key Learnings

- **Project:** roman-numeral-generator
- **Description:** [![DepShield Badge](https://depshield.sonatype.org/badges/anthonyjsargeant/roman-numeral-generator/depshield.svg)](https://depshield.github.io)
- **Java 21 migration completed (2026-05-20):** Spring Boot 1.5→3.2.5, Cucumber 2.3→7.15 (lambda steps rewritten as @Given/@When/@Then), JUnit 4→5, Mockito runners updated. Cucumber integration tests run under `-P integration-test` profile via `mvn verify`, not `mvn test`.
- **XML comment gotcha:** XML comments must not contain `--` (double dash) — the sequence `--release` inside a comment causes a parse error. Use "release-flag" or similar wording instead.

## Do-Not-Repeat

<!-- Mistakes made and corrected. Each entry prevents the same mistake recurring. -->
<!-- Format: [YYYY-MM-DD] Description of what went wrong and what to do instead. -->

## Decision Log

<!-- Significant technical decisions with rationale. Why X was chosen over Y. -->
