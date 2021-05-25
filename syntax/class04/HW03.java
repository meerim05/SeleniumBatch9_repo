package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {
    /*HRMS Application Negative Login:
    Open chrome browser
    Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard"
    Enter valid username
    Leave password field empty
    Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement userName = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("");
        WebElement logBtn = driver.findElement(By.cssSelector("input[name='Submit']"));
        logBtn.click();
        WebElement message=driver.findElement(By.cssSelector("span[id='spanMessage']"));

        boolean messageDisplayed=message.isDisplayed();
        //System.out.println(isSpanMessageDisplayed);
        if(messageDisplayed){
            System.out.println("Password cannot be empty");
        }else{
            System.out.println("Please enter valid password");
        }
        driver.quit();

    }
}