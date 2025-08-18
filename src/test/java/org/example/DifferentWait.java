package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentWait extends DriverSetup{

    @Test
    public void testDelayElement() throws InterruptedException {

        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        browser.get("https://qavbox.github.io/demo/delay");

        browser.findElement(By.xpath("//input[@name='commit1']")).click();
//        Thread.sleep(10000);
        WebElement second_btn = browser.findElement(By.xpath("//h2[@id='delay']"));
        System.out.println(second_btn.getText());

        browser.findElement(By.xpath("//input[@name='commit']")).click();
        WebElement first_btn = browser.findElement(By.xpath("//h2[@id='two']"));

        WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(first_btn,"I am here!"));
//        Thread.sleep(10000);
        System.out.println(first_btn.getText());

    }
}
