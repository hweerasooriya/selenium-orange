package com.testautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by hawe on 3/2/2018.
 */
public class LogInPage {

    private static WebElement element = null;

    // Capture the 'User Name' field
    public static WebElement userNameFld(WebDriver driver) {
        element = driver.findElement(By.id("txtUsername"));
        return element;
    }

    //Capture the 'Password'
    public static WebElement paswordFld(WebDriver driver){
        element = driver.findElement(By.id("txtPassword"));
        return element;
    }
    //Capture the 'Login' Page
    public static WebElement logiBtn(WebDriver driver){
        element = driver.findElement(By.id("btnLogin"));
        return element;
    }
    //Capture the 'Login' Page
    public static WebElement emptyValidationMsg(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id='spanMessage']"));
        return element;
    }
//    public static WebElement userNameIcon(WebDriver driver){
//        element = driver.findElement(By.id("divUsername"));
//        return element;
//    }
//
//    public static WebElement passwordIcon(WebDriver driver){
//        element = driver.findElement(By.id("divUsername"));
//        return element;
//    }
// txtUsername


}
