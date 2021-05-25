package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.syntax.review.commonMethods.FindElementByXpath;

public class WebTablesPagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();

        WebElement PIMbtn=FindElementByXpath(driver,"//a[@id='menu_pim_viewPimModule']");
        PIMbtn.click();




    }
}