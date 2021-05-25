package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    /*Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php");
        WebElement header=driver.findElement(By.xpath("//span[@class='gum']"));
        boolean isHeaderDisplayed = header.isDisplayed();
        System.out.println("Is header displayed "+ isHeaderDisplayed);

        driver.switchTo().frame(1);

        WebElement enrollTodayButton = driver.findElement(By.xpath("//a[@class='enroll-btn']"));
        boolean isEnrollTodayEnabled = enrollTodayButton.isEnabled();
        System.out.println("Is Enroll today enabled "+ isEnrollTodayEnabled);

    }
}