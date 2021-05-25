package com.syntax.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    private static WebDriver driver;

    /*
     *this method will navigate to a website by the given URl
     *@param url
     */
    public static void setUpWithSpecificUrl(String url){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /**
     * this method will quit an open browser
     */
    public static void tearDown(){
        if(driver!=null) {
            driver.quit();
        }
    }
}


