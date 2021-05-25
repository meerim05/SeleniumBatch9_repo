package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;

public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUserName")
    public WebElement userNameTextBox;
}
