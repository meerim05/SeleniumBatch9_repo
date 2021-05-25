package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    /*
    Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify the title is displayed
Print out the title of the all pages
     */
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        String mainPage= driver.getWindowHandle();
        WebElement newTab =driver.findElement(By.xpath("//button[@id='tabButton']"));
        WebElement newWindow =driver.findElement(By.xpath("//button[@id='windowButton']"));
        WebElement newWindowMessage =driver.findElement(By.xpath("//button[@id='messageWindowButton']"));

        newTab.click();
        newWindow.click();
        newWindowMessage.click();

       /* Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator=allWindowHandles.iterator();
        System.out.println(allWindowHandles);
        while(iterator.hasNext()) {
            String handle = iterator.next();
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.close();
        }
        driver.switchTo().window(mainPageWindowHandle);
*/
        Set<String> textTabs = driver.getWindowHandles();
        System.out.println(textTabs.size());
        Iterator<String> iterate = textTabs.iterator();
        System.out.println(textTabs);
        while (iterate.hasNext()) {
            String x = iterate.next();
            if (!x.equals(mainPage)) {
                driver.switchTo().window(x);
                System.out.println(driver.getTitle());
            }
        }
        driver.switchTo().window(mainPage);
        WebElement titleDispaly = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        titleDispaly.isDisplayed();
        System.out.println(titleDispaly);
    }
}





