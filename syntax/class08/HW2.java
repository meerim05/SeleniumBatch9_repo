package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW2 {
        public static String url = "https://the-internet.herokuapp.com/dynamic_controls";
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement checkbox = driver.findElement(By.xpath("//div[@id='checkbox']/input"));
            checkbox.click();
            boolean verify = checkbox.isEnabled();
            System.out.println("Checkbox status " + verify);
            WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
            removeButton.click();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
            //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            WebElement verityText = driver.findElement(By.xpath("//p[@id='message']"));
            boolean vText = verityText.isDisplayed();
            System.out.println("Text status =" + vText);
            WebElement enableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
            enableButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'ena')]")));
            WebElement textbox = driver.findElement(By.cssSelector("input[type='text']"));
            System.out.println(textbox.getText());
            WebElement typeText = driver.findElement(By.xpath("//input[@type = 'text']"));
            typeText.sendKeys("Wellcome to Syntax");
            WebElement disableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
            disableButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'It')]")));
            WebElement typeText1 = driver.findElement(By.xpath("//input[@type = 'text']"));
            System.out.println(typeText1.isEnabled());
        }
    }

