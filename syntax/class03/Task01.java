package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/" +
                "Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
       /*
       //input[@id='ctl00_MainContent_username']
       //input[@name='ctl00$MainContent$password']
      //input[@name='ctl00$MainContent$login_button']
        */
        WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
        
        WebElement logoutButton=driver.findElement(By.xpath("//a[text()='Logout']"));
        logoutButton.click();

        driver.quit();

    }
}