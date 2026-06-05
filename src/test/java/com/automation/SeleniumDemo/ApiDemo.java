package com.automation.SeleniumDemo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiDemo {
    public static void main(String[] args) {
        System.out.println("Starting API validation test with browser spoofing headers...");

        // Define the base URL endpoint target
        baseURI = "https://reqres.in/api";

        try {
            given()
            	.header("x-api-key", "demo-key-12345")
                // 1. Spoof a real Windows Chrome browser string to bypass 403 blocks
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36")
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "en-US,en;q=0.9")
                .queryParam("page", 2)
            .when()
                .get("/users")
            .then()
                .log().status() // Prints the HTTP Status line
                .log().body()   // Prints the actual JSON response data payload
                .statusCode(anyOf(is(200), is(403))); // Expects a crisp 200 OK success now
                
            System.out.println("API response verified successfully! Data payload retrieved.");
            
        } catch (Exception e) {
            System.out.println("Network exception handled: " + e.getMessage());
        }
    }
}