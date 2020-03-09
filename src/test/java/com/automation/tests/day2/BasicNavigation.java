package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.get("http://www.google.com");
Thread.sleep(3000);

String title = driver.getTitle();
        System.out.println("title is "+ title);
        String expectedTitle = "Google";
        if (expectedTitle.equals(title)){
            System.out.println("Test Passed!");
        }else {
            System.out.println("Test Failed!!!");
        }
        driver.navigate().to("http://www.amazon.com");
        if (driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("Test Passed!");
        }else {
            System.out.println("Failed!!!");
        }
        verifyEquals(driver.getTitle(), "amazon");
         driver.close();
    }
    public static void verifyEquals(String arg1, String arg2){
        if (arg1.toLowerCase().contains(arg2)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
