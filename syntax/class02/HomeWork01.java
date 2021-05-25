package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstName= driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Alina");
        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Davit");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("2010 E 16 St");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Brooklyn");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("NY");
        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys(("11230"));
        WebElement phoneNumber=driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("367293093");
        WebElement ssn=driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys(("1112223333"));
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys(("alina@gmail.com"));
        WebElement password= driver.findElement(By.id("customer.password"));
        password.sendKeys("Alina123");
        WebElement confirmPassword=driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys(("Alina123"));
        WebElement register=driver.findElement(By.linkText("Register"));
        register.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
