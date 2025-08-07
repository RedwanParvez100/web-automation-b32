package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocateWebElement extends DriverSetup {

    @Test
    public void testLocateElement() throws InterruptedException {

//        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//        inputBox = browser.findElement(By.id("autocomplete"));
//        inputBox = browser.findElement(By.className("ui-autocomplete-input"));
//        inputBox = browser.findElement(By.tagName("input"));

        browser.get("https://www.google.com/");
//        String pageTitle = browser.getTitle();
//        System.out.println(pageTitle);

        WebElement inputBox;

//        inputBox = browser.findElement(By.className("gLFyf"));
//        inputBox = browser.findElement(By.id("APjFqb"));
//        inputBox = browser.findElement(By.tagName("textarea"));
//        inputBox = browser.findElement(By.name("q"));

        // combination of : tagname, attribute,value
//        inputBox = browser.findElement(By.cssSelector("textarea[name='q']"));
//        inputBox = browser.findElement(By.xpath("//textarea[@name='q']"));

        // only for tagName
//        inputBox = browser.findElement(By.cssSelector("textarea"));
//        inputBox = browser.findElement(By.xpath("//textarea"));

        // only for className
//        inputBox = browser.findElement(By.cssSelector(".gLFyf"));
//        inputBox = browser.findElement(By.xpath("//*[@class='gLFyf']"));

        // only for Id
//        inputBox = browser.findElement(By.cssSelector("#APjFqb"));
        inputBox = browser.findElement(By.xpath("//*[@id='APjFqb']"));
        inputBox.sendKeys("Hello");
        Thread.sleep(2000);

//        browser.findElement(By.linkText("Gmail")).click();
//        browser.navigate().back();
//        Thread.sleep(1000);
//
//        browser.findElement(By.partialLinkText("age")).click();
//        Thread.sleep(1000);
//        browser.navigate().back();


        List<WebElement> all_linksElements = browser.findElements(By.xpath("//a"));
        for (WebElement linkElement : all_linksElements){
            String text = linkElement.getText();
            System.out.println(text);
        }

    }

}
