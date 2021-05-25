package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    /*Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url = "http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement simpleAlertButton = driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        WebElement confirmAlertButton = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss();


        WebElement promptAlertButton = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Syntax");
        promptAlert.accept();
    }
}