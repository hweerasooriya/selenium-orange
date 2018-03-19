package com.testautomation.page.action;

import com.testautomation.data.LoginData;
import com.testautomation.page.LogInPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by hawe on 3/2/2018.
 */
public class LoginAction {

    public static void isDiplayedEmptyValidation(WebDriver driver) throws InterruptedException {
        LogInPage.userNameFld(driver).clear();
        LogInPage.paswordFld(driver).clear();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LogInPage.logiBtn(driver));
        Assert.assertEquals(LogInPage.emptyValidationMsg(driver).getText(),"Username cannot be empty","Incorrect Validation Error Message");
    }

    public static void isDisplayedInvalidValidation(WebDriver driver) throws InterruptedException {
        LogInPage.userNameFld(driver).sendKeys("test");
        LogInPage.paswordFld(driver).sendKeys("test12");
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", LogInPage.logiBtn(driver));
        Assert.assertEquals(LogInPage.emptyValidationMsg(driver).getText(),"Invalid credentials","Incorrect Validation Message");
    }

    public static void isLoginSuccessfully(WebDriver driver) throws InterruptedException {
        // Insert 'User Name' and 'Password' values to the fields
        LogInPage.userNameFld(driver).clear();
        LogInPage.userNameFld(driver).sendKeys(LoginData.userName);
        Thread.sleep(500);
        LogInPage.paswordFld(driver).clear();
        LogInPage.paswordFld(driver).sendKeys(LoginData.password);
        Thread.sleep(500);

        // Click on the 'Login' button
        LogInPage.logiBtn(driver).click();
    }

}
