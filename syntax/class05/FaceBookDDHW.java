package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FaceBookDDHW {
/*
TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options =13?
day dd has 31 day options=32?
year dd has 115 year options=118?
Select your date of birth
Quit browser
 */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
        WebElement monthDropDown = driver.findElement(By.id("month"));
        Select select1 = new Select(monthDropDown);
        List<WebElement> allMonth = select1.getOptions();
        int month = allMonth.size();
        System.out.println(month);

        WebElement daysDropDown = driver.findElement(By.id("day"));
        Select select2 = new Select(daysDropDown);
        List<WebElement> allOptions = select2.getOptions();
        int days = allOptions.size();
        System.out.println(days);

        WebElement yearsDropDown = driver.findElement(By.id("year"));
        Select select3 = new Select(yearsDropDown);
        List<WebElement> allYears = select3.getOptions();
        int years = allYears.size();
        System.out.println(years);

        select1.selectByIndex(2);
        Thread.sleep(1000);
        select2.selectByVisibleText("10");
        Thread.sleep(1000);
        select3.selectByVisibleText("1993");
        driver.quit();


    }
}
