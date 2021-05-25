package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ebayHW {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement categoriesDD= driver.findElement(By.id("gh-cat"));
        Select select=new Select(categoriesDD);

        List<WebElement> options = select.getOptions();
        for (WebElement option:options
        ) {
            String optionText= option.getText();
            System.out.println(optionText);
            }
        select.selectByVisibleText("Computers/Tablets & Networking");

        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();
        WebElement header= driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        boolean isHeaderDisplayed= header.isDisplayed();
        if(isHeaderDisplayed){
            System.out.println("Header is displayed");
        }else{
            System.out.println("Header is not displayed");
        }


    }
}