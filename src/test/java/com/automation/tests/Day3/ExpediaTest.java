package com.automation.tests.Day3;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExpediaTest {
    public static void main(String[] args) throws Exception {


        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://www.expedia.com/");

        driver.findElement(By.className("trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left " +
            "menu-arrow gcw-component gcw-traveler-amount-select " +
            "gcw-component-initialized")).click();
Thread.sleep(2000);

driver.quit();
    }
}
