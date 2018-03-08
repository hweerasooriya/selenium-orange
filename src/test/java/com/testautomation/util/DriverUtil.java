package com.testautomation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by hawe on 3/2/2018.
 */
public class DriverUtil {

    private DriverUtil(){

    }
    private static WebDriver driver;

    static{
        System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
        driver  = new ChromeDriver();
        // driver=new FirefoxDriver();
        driver.manage().window().maximize();

    }

    public static WebDriver getChromeDriver(){
        return driver;
    }
}
