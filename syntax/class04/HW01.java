package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    /*Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement userName= driver.findElement(By.cssSelector("input[name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input[name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logBtn=driver.findElement(By.cssSelector("input[name='Submit']"));
        logBtn.click();

        WebElement logo=driver.findElement(By.cssSelector("img[src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));

        boolean isSyntaxLogoDisplayed=logo.isDisplayed();
        System.out.println(isSyntaxLogoDisplayed);
        driver.quit();

    }
}
