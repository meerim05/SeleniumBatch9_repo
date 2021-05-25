package com.syntax.pages;

import com.syntax.testbase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    private WebElement driver;
    public WebElement userNameField=driver.findElement(By.id("txtUserName"));
    public WebElement passwordField=driver.findElement(By.id("txtPassword"));
    public WebElement loginButton=driver.findElement(By.id("btnLogin"));


}
