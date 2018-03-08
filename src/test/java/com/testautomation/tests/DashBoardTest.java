package com.testautomation.tests;

import com.testautomation.page.action.DashBoardAction;
import com.testautomation.page.action.LoginAction;
import com.testautomation.util.DriverUtil;
import com.testautomation.util.LoginUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by hawe on 3/5/2018.
 */
public class DashBoardTest {

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

    @Test(priority = 3, description = "Validate Page Header")
    public void isDisplayedPageHeader() throws IOException, InterruptedException {
        DashBoardAction.isDiplayedPageHeader(driver);
    }
    @Test(priority = 4, description = "Validate Page Sub Header")
    public void isDisplayedSubHeading() throws IOException, InterruptedException {
        DashBoardAction.isDiplayedSubHeadingPanel(driver);
    }
    @Test(priority = 5, description = "Validate Assign Leave Text")
    public void isDisplayedAssignLeaveText() throws IOException, InterruptedException {
        DashBoardAction.isDiplayedAssignLeaveText(driver);
    }
    @Test(priority = 6, description = "Validate Assign Leave Button")
    public void isDisplayedAssignLeaveBtn() throws IOException, InterruptedException {
        DashBoardAction.isDiplayedAssignLeaveBtn(driver);
    }
    @Test(priority = 7, description = "Validate Assign Leave Page Navigation")
    public void isEnableClickAssignLeave() throws IOException, InterruptedException {
        DashBoardAction.isNavigatedAssignLeavePage(driver);
    }

}
