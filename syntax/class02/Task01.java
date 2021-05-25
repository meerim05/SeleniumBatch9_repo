package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("web orders")) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
