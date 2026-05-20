# OpenWolf

@.wolf/OPENWOLF.md

This project uses OpenWolf for context management. Read and follow .wolf/OPENWOLF.md every session. Check .wolf/cerebrum.md before generating code. Check .wolf/anatomy.md before reading files.

# Java 21 Migration

This project is being upgraded to Java 21 (current LTS). Follow these instructions for all tasks in this migration.

## Objective
Migrate the codebase from its current Java version to Java 21. Preserve all existing behavior — this is a migration, not a rewrite.

## Rules
- Read all relevant files before making changes
- Make the minimum changes necessary for correctness
- Add a brief inline comment on every changed line explaining why the change was needed
- Do not apply modernization improvements automatically — flag them separately
- Run the existing test suite after changes and report results

## Phase 1 — Assessment (do this first)
1. Identify the current Java version from `pom.xml`, `build.gradle`, or source files
2. Audit all dependencies for Java 21 compatibility; flag any with no compatible version
3. Detect removed or deprecated APIs: `sun.*` internals, `SecurityManager`, finalization (`finalize()`), legacy `Thread` stop/suspend methods
4. Flag any `--add-opens` or `--add-exports` JVM args that paper over module access issues
5. Produce a written migration plan before touching any files

## Phase 2 — Build Config
- Update Maven compiler plugin or Gradle toolchain to source/target Java 21
- Bump dependency versions to Java 21-compatible releases
- Replace `--add-opens` workarounds with proper code where possible

## Phase 3 — Source Changes
- Replace removed APIs with their modern equivalents
- Fix any JPMS/module system conflicts
- Address reflection access warnings

## Output Format for Each Task
1. **Summary** — what changed and why
2. **Breaking changes fixed** — list of incompatibilities resolved
3. **Remaining issues** — anything needing a manual decision
4. **Modernization suggestions** — Java 21 improvements available but not applied (records, sealed classes, pattern matching, virtual threads, text blocks)

