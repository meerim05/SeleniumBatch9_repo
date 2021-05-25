package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {
    public static String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\meeri\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");
        WebElement frameHeader = driver.findElement(By.xpath("//a[text() = 'SYNTAX TECHNOLOGIES ']"));
        boolean isHeaderDisplayed = frameHeader.isDisplayed();
        System.out.println("Is header displayed "+ isHeaderDisplayed);

        driver.switchTo().defaultContent();

        WebElement secondElement = driver.findElement(By.xpath("//iframe[@name = 'FrameTwo']"));
        driver.switchTo().frame(secondElement);
        Thread.sleep(2000);
        WebElement enrollTodayButton = driver.findElement(By.xpath("//a[text() = 'Enroll Today']"));
        boolean isEnrollTodayEnabled = enrollTodayButton.isEnabled();
        System.out.println("Is Enroll today enabled "+ isEnrollTodayEnabled);

    }
}