package com.testautomation.page.action;

import com.testautomation.data.UsersData;
import com.testautomation.page.UsersSearchPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by hawe on 3/5/2018.
 */
public class UsersSearchAction {



    public static void isClickedUsermanagementLink(WebDriver driver) throws InterruptedException{
        Assert.assertEquals(UsersSearchPage.adminLink(driver).getText(),"Admin", "invalid link Text");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", UsersSearchPage.adminLink(driver));
        Assert.assertEquals(UsersSearchPage.userMgmtLink(driver).getText(),"User Management", "invalid link Text");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", UsersSearchPage.userMgmtLink(driver));
        Assert.assertEquals(UsersSearchPage.userMgmtUsersLink(driver).getText(),"Users", "invalid link Text");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", UsersSearchPage.userMgmtLink(driver));
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
    }
    public static void isEnterValuesTextField(WebDriver driver) throws InterruptedException {
        UsersSearchPage.userMgmtUsersName(driver).clear();
        UsersSearchPage.userMgmtUsersName(driver).sendKeys(UsersData.userName);
        Thread.sleep(500);
        new Select(UsersSearchPage.userRoleDrpDwn(driver)).selectByVisibleText("Admin");
        new Select(UsersSearchPage.userSystemStatusDrpDwn(driver)).selectByVisibleText("Enabled");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", UsersSearchPage.searchBtn(driver));
    }
   // public static void isClickSearchBtn(WebDriver driver) throws InterruptedException {

    //}
//searchBtn

}
