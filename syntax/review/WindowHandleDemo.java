package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleDemo {
    public static String url = "https://swagger.io/tools/swaggerhub/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //get the handle for parent window
        String homepagehandle = driver.getWindowHandle();
        System.out.println("The handle for home page is: " + homepagehandle);
        WebElement Link1 = driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        Link1.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on some icon on the new tab
        Set<String> allhandles = driver.getWindowHandles();
        Iterator<String> it = allhandles.iterator();
        homepagehandle = it.next();
        String link1handle = it.next();
        System.out.println("The handle for link1 is : " + link1handle);
        //switch to the child tab and ckick on some new link
        driver.switchTo().window(link1handle);
        WebElement link2 = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        link2.click();

        //get the link2window handle
        allhandles = driver.getWindowHandles();
        it = allhandles.iterator();

        int handle_no = 2;
        String value = null;
        for (int i = 0; it.hasNext(); i++) {
            String link2handle = value;
            System.out.println("This is a link 2 handle" + link2handle);
            break;
        }

    }
        //Thread.sleep(3000);
        //driver.switchTo().window(homepagehandle);
        //Thread.sleep(3000);
        //driver.switchTo().window(link2handle);
        //Thread.sleep(3000);
        //driver.switchTo().window(link1handle);
        //driver.close();

}
