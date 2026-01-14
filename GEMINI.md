# Project Overview

This is a Hytale plugin template project. It provides a minimal, ready-to-use setup for creating Hytale plugins using Java and Gradle. The project is configured with modern build tools, automated testing, and a CI/CD workflow using GitHub Actions.

## Main Technologies

*   **Java 25**: The project uses the latest Java version.
*   **Gradle**: The build system is Gradle with the Kotlin DSL.
*   **ShadowJar**: The `shadow` plugin is used to bundle dependencies into the final plugin JAR.
*   **JUnit 5**: The project is set up for unit testing with JUnit 5.
*   **GitHub Actions**: A CI/CD workflow is included for automated builds and releases.

## Architecture

The project follows a standard Java project layout. The main plugin class is located in `src/main/java`. The `onEnable` and `onDisable` methods in this class serve as the entry points for the plugin's logic. The plugin's metadata is defined in `src/main/resources/manifest.json`.

# Building and Running

## Building the plugin

To build the plugin and create a JAR file with all dependencies bundled, run the following command:

```bash
./gradlew shadowJar
```

The output JAR file will be located in `build/libs/`.

## Running the plugin in a test server

The project includes a custom Gradle plugin for running a test server with the plugin installed. To use it, run:

```bash
./gradlew runServer
```

This will download a server JAR (if not already cached), build the plugin, and start the server with the plugin loaded.

## Running tests

To run the unit tests, use the following command:

```bash
./gradlew test
```

# Development Conventions

## Coding Style

The project uses standard Java conventions. The code is well-commented, and the `README.md` file provides clear instructions for development.

## Contribution Guidelines

The `README.md` file outlines the contribution guidelines. Contributions are welcome via pull requests.

## Releasing

To create a new release, create a new Git tag and push it to the repository.

```bash
git tag v1.0.0
git push origin v1.0.0
```

GitHub Actions will automatically build the plugin and create a release with the plugin JAR.
