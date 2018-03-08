package com.testautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by hawe on 3/5/2018.
 */
public class UsersSearchPage {

    private static WebElement element = null;

    // Capture the Admin Link
    public static WebElement adminLink(WebDriver driver){
        element = driver.findElement(By.id("menu_admin_viewAdminModule"));
        return element;
    }

    // Capture the 'UserManagement' link
    public static WebElement userMgmtLink(WebDriver driver) {
        element = driver.findElement(By.id("menu_admin_UserManagement"));
        return element;
    }

    // Capture the 'Users' Link
    public static WebElement userMgmtUsersLink(WebDriver driver) {
        element = driver.findElement(By.linkText("Users"));
        return element;
    }

    // Capture the 'UserName' Link
    public static WebElement userMgmtUsersName(WebDriver driver) {
        element = driver.findElement(By.id("searchSystemUser_userName"));
        return element;
    }
    // Capture the 'Role' Drop Down
    public static WebElement userRoleDrpDwn(WebDriver driver) {
        element = driver.findElement(By.id("searchSystemUser_userType"));
        return element;
    }
    // Capture the Status
    public static WebElement userSystemStatusDrpDwn(WebDriver driver){
        element = driver.findElement(By.id("searchSystemUser_status"));
        return element;
    }
    // Capture the 'Search' Button
    public static WebElement searchBtn(WebDriver driver){
        element = driver.findElement(By.id("searchBtn"));
        return element;
    }

}
