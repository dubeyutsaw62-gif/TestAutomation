# Selenium WebDriver Automation Demo

A lightweight, standalone Java automation project demonstrating web UI interactions using Selenium WebDriver, Maven, and Explicit Waits.

## Architecture & Tech Stack
* **Language:** Java 17+
* **Build Tool:** Maven (Quickstart Archetype)
* **Automation Tool:** Selenium WebDriver (v4.21.0)
* **Driver Management:** WebDriverManager

## Automation Use Cases Covered
1. **Dynamic Synchronization:** Leveraged `WebDriverWait` and `ExpectedConditions` (Explicit Waits) to handle asynchronous element rendering dynamically, eliminating flaky test execution.
2. **Element Locators:** Implemented robust element targeting using advanced selectors (`By.id`, `By.cssSelector`).
3. **Session Management:** Proper instantiation and teardown routing for the `ChromeDriver` lifecycle.

## How to Run Locally
1. Clone the repository: `git clone <your-repo-url>`
2. Import as a Maven project into Eclipse or IntelliJ.
3. Run `src/main/java/com/automation/SeleniumDemo/App.java` as a Java Application.
