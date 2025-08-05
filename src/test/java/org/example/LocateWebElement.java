package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWebElement extends DriverSetup {

    @Test
    public void testLocateElement() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        String pageTitle = browser.getTitle();
        System.out.println(pageTitle);

        WebElement inputBox;

//        inputBox = browser.findElement(By.id("autocomplete"));

//        inputBox = browser.findElement(By.className("ui-autocomplete-input"));

//        inputBox = browser.findElement(By.tagName("input"));
        inputBox.sendKeys("Hello");
        Thread.sleep(2000);




    }


}
