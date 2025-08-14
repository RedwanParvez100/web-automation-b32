package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetup {

    @Test
    public void testWebAlert() throws InterruptedException {

        browser.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertmsg1 = browser.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        alertmsg1.click();
        Thread.sleep(1000);
        Alert alert = browser.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text);

        WebElement alertmsg2 = browser.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        alertmsg2.click();
        Thread.sleep(1000);
        text = alert.getText();
        System.out.println(text);
        alert.dismiss();
        Thread.sleep(1000);

        WebElement alertmsg3 = browser.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        alertmsg3.click();
        alert.sendKeys("hello alert");
        Thread.sleep(1000);
        text = alert.getText();
        System.out.println(text);
        alert.accept();
        Thread.sleep(2000);
    }
}
