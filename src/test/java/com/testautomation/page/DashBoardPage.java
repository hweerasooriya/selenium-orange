package com.testautomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by hawe on 3/5/2018.
 */
public class DashBoardPage {

    private static WebElement element = null;

    // Capture the 'Page Header' field
    public static WebElement dashBoardHeader(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
        return element;
    }

    // Capture the 'SubHeadingPanel' field
    public static WebElement subHeadingPanel(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"panel_resizable_0_0\"]/legend"));
        return element;
    }
    // Capture the 'AssginLeaveTesxt' field
    public static WebElement assignLeaveText(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span"));
        return element;
    }
    // Capture the 'AssginLeaveBtn' Btn
    public static WebElement assignLeaveBtn(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img"));
        return element;
    }
    // Capture the 'AssginLeave' Page Heading
    public static WebElement assignLeavePgHeader(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"assign-leave\"]/div[1]/h1"));
        return element;
    }
//

}
