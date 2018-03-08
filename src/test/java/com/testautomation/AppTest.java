package com.testautomation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private AppTest(){}

@org.testng.annotations.Test
    private static void test1() throws InterruptedException {


        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        //driver.close();
       // driver.quit();

    }
}