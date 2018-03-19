package com.testautomation.util;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by hawe on 3/2/2018.
 */
public class LoginUtil {

    public static void login(WebDriver driver) throws InterruptedException {
        //Open the VTP Application
        driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//
//        LogInPage.userNameFld(driver).clear();
//        LogInPage.userNameFld(driver).sendKeys(LoginData.userName);
//        Thread.sleep(500);
//        LogInPage.paswordFld(driver).clear();
//        LogInPage.paswordFld(driver).sendKeys(LoginData.password);
//        Thread.sleep(500);

    }

}
