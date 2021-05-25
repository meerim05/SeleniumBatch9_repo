package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*Navigate to http://syntaxtechs.com/selenium-practice/index.php
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        Thread.sleep(2000);
        WebElement practising=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        practising.click();
        Thread.sleep(2000);
        WebElement simpleForm=driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement textBox=driver.findElement(By.xpath("//input[@id = 'user-message']"));
        textBox.sendKeys("Good morning");
        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        Thread.sleep(2000);
        driver.quit();

    }
}