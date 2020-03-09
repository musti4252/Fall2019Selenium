package com.automation.tests.day2;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class JumpToAnotherWindow {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowID : windowHandles) {
            if (!windowID.equals(windowHandles)) {
                driver. switchTo().window(windowID);
            }
            System.out.println("After Switch" + driver.getCurrentUrl());
        }


        System.out.println(windowHandles);
        System.out.println(driver.getCurrentUrl());
        //driver.quit();
    }
    }

