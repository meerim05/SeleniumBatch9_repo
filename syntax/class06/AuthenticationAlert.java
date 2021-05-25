package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    public static String url = "http://test:test@abcdatabase.com/basicauth";
                                    // username:password@
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\meeri\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

    }
}