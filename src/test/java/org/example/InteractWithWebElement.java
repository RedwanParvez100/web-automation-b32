package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithWebElement extends DriverSetup{

    @Test
    public void interactWithElement() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//        String title = browser.getTitle();
//        System.out.println(title);
//
//        WebElement tagName = browser.findElement(By.tagName("h1"));
//        System.out.println(tagName.getText());

        WebElement radiobtn1 = browser.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("Display Status: " +radiobtn1.isDisplayed());
        System.out.println("Select Status: " +radiobtn1.isSelected());
        radiobtn1.click();
        Thread.sleep(1000);
        System.out.println("After Click Select Status: " +radiobtn1.isSelected());

        WebElement radiobtn2 = browser.findElement(By.xpath("//input[@value='radio2']"));
        radiobtn2.click();
        System.out.println("After Click Another-btn, Radiobtn-1 Select Status: " +radiobtn1.isSelected());

        WebElement inputText = browser.findElement(By.xpath("//input[@id='autocomplete']"));
        inputText.sendKeys("hello");
        Thread.sleep(1000);
        inputText.clear();
        Thread.sleep(1000);
        inputText.sendKeys("hello from xpath");
        Thread.sleep(1000);

        String elementId = inputText.getAttribute("id");
        System.out.println("Id: " +elementId);
        String elementClass = inputText.getAttribute("class");
        System.out.println("Class: " +elementClass);
        String elementPlaceholder = inputText.getAttribute("placeholder");
        System.out.println("Placeholder: " +elementPlaceholder);

        WebElement openTab = browser.findElement(By.xpath("//a[@id='opentab']"));
        String bgColor = openTab.getCssValue("background-color");
        System.out.println(bgColor);

        WebElement showBox = browser.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println("Before Display status: " +showBox.isDisplayed());
        browser.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        System.out.println("After Display status: " +showBox.isDisplayed());

        WebElement checkBox = browser.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        System.out.println("Is enabled: " +checkBox.isEnabled());
        checkBox.click();
        Thread.sleep(2000);

    }
}
