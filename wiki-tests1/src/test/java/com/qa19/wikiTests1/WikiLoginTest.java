package com.qa19.wikiTests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikiLoginTest {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://wikipedia.org");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
        public void testLogin() {
        //SelectLanguage
        wd.findElement(By.id("js-link-box-en")).click();
        //initLogin
        wd.findElement(By.id("pt-login")).click();
        //fillLoginForm
        wd.findElement(By.name("wpName")).click();
        wd.findElement(By.name("wpName")).clear();
        wd.findElement(By.name("wpName")).sendKeys("NastyaNastya66");
        //type password
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).sendKeys("korsarushka");
        //get in
        wd.findElement(By.id("wpLoginAttempt")).click();
        //search something
        wd.findElement(By.id("searchInput")).click();
        wd.findElement(By.id("searchInput")).clear();
        wd.findElement(By.id("searchInput")).sendKeys("Game of Thrones");
        //button search
        wd.findElement(By.id("searchButton")).click();
        //put to favorites
        wd.findElement(By.cssSelector("[data-mw='interface']")).click();

    }
        @AfterClass
                public void tearDown(){
            wd.quit();
        }



    }


