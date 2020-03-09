package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();

        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(2000);
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.close();

    }
}
