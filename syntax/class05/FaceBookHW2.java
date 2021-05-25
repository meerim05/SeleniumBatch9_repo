package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookHW2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Meer");
        Thread.sleep(2000);
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Taalai");
        Thread.sleep(2000);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("msja@gmail.com");
        Thread.sleep(2000);
        WebElement confirmEmail= driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("msja@gmail.com");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("M1234");
        WebElement monthDropDown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropDown);
        month.selectByIndex(2);
        WebElement daysDropDown = driver.findElement(By.id("day"));
        Select day = new Select(daysDropDown);
        day.selectByVisibleText("10");
        WebElement yearsDropDown = driver.findElement(By.id("year"));
        Select year = new Select(yearsDropDown);
        year.selectByVisibleText("1993");
        Thread.sleep(2000);
        WebElement genderBtn=driver.findElement(By.xpath("//label[text()='Female']"));
        genderBtn.click();
        Thread.sleep(2000);
        WebElement signUp=driver.findElement(By.name("websubmit"));
        signUp.click();


    }
}