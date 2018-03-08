package com.testautomation.tests;

import com.testautomation.page.action.LoginAction;
import com.testautomation.util.DriverUtil;
import com.testautomation.util.LoginUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by hawe on 3/2/2018.
 */
public class LoginTest {

    WebDriver driver = null;

    @BeforeTest
    public void openWebPage() throws IOException, InterruptedException {
        driver = DriverUtil.getChromeDriver();
    }
    @Test(priority = 1, description = "Validate the Invalid Validation Message")
    public void openApp() throws IOException, InterruptedException {
        LoginUtil.login(driver);
    }

    @Test(priority = 2, description = "Validate the Invalid Validation Message")
    public void isCheckInvalidValidation() throws IOException, InterruptedException {
        LoginAction.isDisplayedInvalidValidation(driver);
    }

    @Test(priority = 3, description = "Validate the Empty Validation")
    public void isDiplayedEmptyValidation() throws IOException, InterruptedException {
        LoginAction.isDiplayedEmptyValidation(driver);
    }
    @Test(priority = 4,description = "Successfully Login to the sytem")
    public void isSuccessfullyLogin()  throws IOException, InterruptedException {
        LoginAction.isLoginSuccessfully(driver);
    }



}
