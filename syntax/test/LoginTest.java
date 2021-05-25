package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.testbase.BaseClass;

public class LoginTest {
    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginTest loginPage=new LoginTest();


    }
}
