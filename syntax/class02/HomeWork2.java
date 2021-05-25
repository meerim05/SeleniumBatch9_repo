package com.syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Meer");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Taalai");
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("msja@gmail.com");
        WebElement confirmEmail= driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("msja@gmail.com");
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("M1234");
        WebElement signUp=driver.findElement(By.name("websubmit"));
        signUp.click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_9_/0")).click();
        driver.quit();
    }
}