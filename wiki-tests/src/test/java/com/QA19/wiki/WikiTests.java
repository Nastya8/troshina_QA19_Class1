package com.QA19.wiki;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WikiTests {
    WebDriver wd;
    @Test
    public void openSite(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.ebay.com/");

        String actual = wd.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.ebay.com/" );
        wd.quit();
    }
}
