package com.automation.tests.Day3;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsPractice {
    public static void main(String[] args) throws Exception {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Onur Alp");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("onuralpd@gmail.com");
        Thread.sleep(2000);
        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        signUp.click();
        Thread.sleep(2000);

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

        WebElement message =driver.findElement(By.className("subheader"));
        String actual = message.getText();



        if (expectedMessage.equals(actual)){
            System.out.println("Test Passed!");
        }else {
            System.out.println("Test Failed!!!");
        }


driver.quit();
    }
}
