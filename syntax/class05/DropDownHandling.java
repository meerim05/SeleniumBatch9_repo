package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandling {
    public static void main(String[] args) throws InterruptedException {
        String url="http://syntaxtechs.com/selenium-practice/basic-select-dropdown-demo.php";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDropDown= driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDropDown);
       // select.selectByIndex(2);
       // Thread.sleep(1000);
       //select.selectByVisibleText("Wednesday");
        // Thread.sleep(1000);
      //  select.selectByValue("Sunday");
       List<WebElement> allOptions=select.getOptions();
       int size= allOptions.size();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
           String optionText=allOptions.get(i).getText();
            System.out.println(optionText);
            select.selectByIndex(i);
            Thread.sleep(2000);
            //select every element by 2sec
        }
    }
}
