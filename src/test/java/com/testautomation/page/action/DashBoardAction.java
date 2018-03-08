package com.testautomation.page.action;

import com.testautomation.page.DashBoardPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by hawe on 3/5/2018.
 */
public class DashBoardAction {
    public static void isDiplayedPageHeader(WebDriver driver) throws InterruptedException {
        DashBoardPage.dashBoardHeader(driver).isDisplayed();
    }
    //CheckWhether Sub Panel Heading is Available
    public static void isDiplayedSubHeadingPanel(WebDriver driver) throws InterruptedException {
        Assert.assertEquals(DashBoardPage.subHeadingPanel(driver).getText(),"Quick Launch","Invalid Page Sub Heading");
    }
    //CheckWhether AssignLeaveText is Available
    public static void isDiplayedAssignLeaveText(WebDriver driver) throws InterruptedException {
        Assert.assertEquals(DashBoardPage.assignLeaveText(driver).getText(),"Assign Leave", "Invalid Text Heading");
    }
    //CheckWhether AssignLeaveButtom is Available
    public static void isDiplayedAssignLeaveBtn(WebDriver driver) throws InterruptedException {
        DashBoardPage.assignLeaveBtn(driver);
    }
    //CheckWhether AssignLeaveButtom is navigated to the Assign Leave Page
    public static void isNavigatedAssignLeavePage(WebDriver driver) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",  DashBoardPage.assignLeaveBtn(driver));
        Assert.assertEquals(DashBoardPage.assignLeavePgHeader(driver).getText(),"Assign Leave","Invalid Page Title");
        driver.navigate().back();

    }

}
