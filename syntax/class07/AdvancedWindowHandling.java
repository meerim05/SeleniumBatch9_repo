package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\meeri\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();

        WebElement instaButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instaButton.click();
        fbButton.click();
        instaAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        Iterator<String> it = allWindowHandles.iterator();
        while(it.hasNext()){ //start iterating through handles
            String handle = it.next();//get the next handle
            if(!handle.equals(mainPageHandle)){ //set condition
                driver.switchTo().window(handle); // switch to a window 
                System.out.println(driver.getTitle());
                driver.close();
            }

        }
        driver.switchTo().window(mainPageHandle);
        instaButton.click();
    }
}
