package com.testautomation.tests;

import com.testautomation.page.action.LoginAction;
import com.testautomation.page.action.UsersSearchAction;
import com.testautomation.util.DriverUtil;
import com.testautomation.util.LoginUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by hawe on 3/5/2018.
 */
public class UsersSearchTest {

    WebDriver driver = null;

    @BeforeTest
    public void openWebPage() throws IOException, InterruptedException {
        driver = DriverUtil.getChromeDriver();
    }
    @Test(priority = 1, description = "Validate the Invalid Validation Message")
    public void openApp() throws IOException, InterruptedException {
        LoginUtil.login(driver);
    }

    @Test(priority = 2, description = "SucessFully Login To the System")
    public void loginToSystem() throws IOException, InterruptedException {
        LoginAction.isLoginSuccessfully(driver);
    }

    @Test(priority = 3, description = "Validate the Link")
    public void isClickedLink() throws IOException, InterruptedException {
        UsersSearchAction.isClickedUsermanagementLink(driver);
    }
    @Test(priority = 4, description = "Validate Search Fields")
    public void isEnterValuesTextField() throws IOException, InterruptedException {
        UsersSearchAction.isEnterValuesTextField(driver);
    }

}
