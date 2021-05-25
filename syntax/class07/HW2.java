package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
   /* navigate to http://www.uitestpractice.com/Students/Contact
    click on the link
    get text
    print out in the console
*/
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        String mainPage=driver.getWindowHandle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement link= driver.findElement(By.linkText("This is a Ajax link"));
        link.click();
        WebElement text= driver.findElement(By.xpath("//div[@class='ContactUs']"));
        System.out.println(text.getText());
        driver.quit();

    }
}