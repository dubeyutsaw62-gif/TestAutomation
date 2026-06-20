# Multi-Framework Test Automation Sandbox (Java Engine)

A comprehensive, production-grade test automation repository demonstrating cross-tier validation strategies. This project implements front-end User Interface (UI) testing using both legacy and modern engines alongside fast, programmatic back-end Application Programming Interface (API) validation.

---

##  Key Learning Objectives & Architecture

This sandbox repository moves away from isolated, single-tool scripting to showcase an integrated, multi-framework test harness under a unified Maven dependency management lifecycle.

### 1. Front-End UI Automation (Classic)
* **Engine:** Selenium WebDriver 4.x
* **Core Focus:** Structural DOM synchronization, element wait mechanisms (`Implicit`, `Explicit`, `Fluent`), and cross-browser driver pooling.
* **Target:** Core interface interactions, handling dynamic elements, and simulating authentic user journeys.

### 2. Front-End UI Automation (Modern Next-Gen)
* **Engine:** Microsoft Playwright for Java
* **Core Focus:** Automated code generation (`codegen`), execution speed optimization, headful/headless binary switching, and native auto-retry assertion polling.
* **Target:** Rapid UI verification bypassing the typical resource overhead seen in traditional WebDriver architectures.

### 3. Back-End API Automation
* **Engine:** REST-Assured
* **Core Focus:** Fluent Behavior-Driven Development (BDD) syntax patterns (`given()`, `when()`, `then()`), JSON data payload traversal, network firewall/User-Agent spoofing, and HTTP header security injection.
* **Target:** Direct database logic communication layer validation, bypassing presentation rendering to verify schema structure and core transactional data integrity.

---

##  Framework Component Map

The automation suites are segmented within standard Maven test test-class roots:

```text
SeleniumDemo/
│
├── src/test/java/com/automation/SeleniumDemo/
│   ├── App.java            <-- Core Selenium WebDriver Suite (UI Testing)
│   ├── PlaywrightDemo.java <-- Playwright Context Lifecycle (Modern UI Testing)
│   └── ApiDemo.java        <-- REST-Assured Network Verification (API Testing)
│
└── pom.xml                 <-- Unified Maven Dependency & Plugin Core Manifest
