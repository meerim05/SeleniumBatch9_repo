package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise01 {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://www.saucedemo.com/";
        driver.get(url);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.className("inventory_item_name")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("ABOUT")).click();
        Thread.sleep(3000);
       // System.out.println(driver.getTitle());
       String title=driver.getTitle();
        if(title.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")){
            System.out.println("Boom is correct one");
        }
        else{
            System.out.println("You have failed");
        }
        driver.navigate();
        Thread.sleep(3000);
        driver.findElement(By.className("shopping_card_link")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(3000);
        menu.click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("")).click();




    }
}
