package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicWebTables {

    public static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr")); // storing all the rows in the List
        for (int i = 1; i < rows.size(); i++) { // starting to loop
            String rowText = rows.get(i).getText(); // getting the text
            System.out.println(rowText);
            if(rowText.contains("Bob Feather")) { // setting a condition to click on checkbox
                List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@id = 'ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click(); // locating all the checkboxes
                // grabbing a single row checkbox and clicking
                break;
            }
        }
    }
}