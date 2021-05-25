package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.syntax.review.commonMethods.FindElementByXpath;

public class CalendarsDemo {
    public static String url = "http://aa.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement calander1 = FindElementByXpath(driver, "//input[@id='aa-leavingOn']");
        calander1.click();
        WebElement month = FindElementByXpath(driver, "//span[@class='ui-datepicker-month']");
        System.out.println(month.getText());
        while(!month.getText().equals("October"))
        {
            WebElement nextbtn = FindElementByXpath(driver, "//a[@title='Next']");
            nextbtn.click();
            month = FindElementByXpath(driver, "//span[@class='ui-datepicker-month']");
            System.out.println(month.getText());
        }
        List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
        for(WebElement date:dates){
            System.out.println(date.getText());
        }
    }
}