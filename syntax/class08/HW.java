package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled

Build functions (methods) to open and close browsers
     */public static String url = " https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        //driver.manage().window().maximize();
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeButton=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id='message']")));
        WebElement verifyText= driver.findElement(By.cssSelector("p[id='message']"));
        System.out.println(verifyText.isDisplayed());

        WebElement enableButton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'enabled')]")));
        WebElement message= driver.findElement(By.xpath("//p[contains(text(), 'enabled')]"));
        System.out.println(message.isEnabled());

        WebElement sendText= driver.findElement(By.xpath("//input[@type='text']"));
        sendText.sendKeys("HomeWork");

        WebElement disableButton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text() ,'disabled')]")));
        WebElement message2= driver.findElement(By.xpath("//input[@type = 'text']"));
        System.out.println(message2.isEnabled());


    }
}