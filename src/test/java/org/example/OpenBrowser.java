package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenBrowser extends DriverSetup{


    @Test
    public void testGooglePageTitle() {

        // Load "https://www.google.com" webpage
        browser.get("https://www.google.com");

        // Get page title
        String pageTitle = browser.getTitle();
        System.out.println(pageTitle);

        // Validate title with text "Google"
        Assert.assertEquals(pageTitle, "Google");

    }

    @Test
    public void testGooglePageURL() {
        // Load "https://www.google.com" webpage
        browser.get("https://www.google.com");

        // Get page Url
        String pageUrl = browser.getCurrentUrl();
        System.out.println(pageUrl);

        // Validate Url with Url "Google"
        Assert.assertEquals(pageUrl, "https://www.google.com/");

    }
}
