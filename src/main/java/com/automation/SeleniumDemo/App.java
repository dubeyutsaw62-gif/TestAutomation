package com.automation.SeleniumDemo;

/**
 * Hello world!
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // 1. Initialize the Chrome driver object (Standard Java OOPs instantiation)
        WebDriver driver = new ChromeDriver();
        
        try {
            // 2. Open the website
            driver.get("https://www.saucedemo.com/");
            
            // 3. Find the username field using its ID and type "standard_user"
            WebElement usernameField = driver.findElement(By.id("user-name"));
            usernameField.sendKeys("standard_user");
            
            // 4. Find the password field and type the password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");
            
            // 5. Find the login button and click it
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();
            
            // 6. Print the page title to verify successful login
            System.out.println("Page title is: " + driver.getTitle());
            
            Thread.sleep(5000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
        	driver.quit();
        }
    }
}