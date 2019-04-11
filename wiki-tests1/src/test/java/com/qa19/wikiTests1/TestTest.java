package com.qa19.wikiTests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestTest {
    WebDriver wd;
    @Test
        public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://wikipedia.org");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //click Russia button
        wd.findElement(By.id("js-link-box-ru")).click();
        //click to come in
        wd.findElement(By.id("pt-login")).click();
        //type name
        wd.findElement(By.name("wpName")).click();
        wd.findElement(By.name("wpName")).clear();
        wd.findElement(By.name("wpName")).sendKeys("NastyaNastya66");
        //type password
        wd.findElement(By.name("wpPassword")).click();
        wd.findElement(By.name("wpPassword")).clear();
        wd.findElement(By.name("wpPassword")).sendKeys("korsarushka");
        //get in
        wd.findElement(By.id("wpLoginAttempt")).click();
        //bye-bye!
        wd.quit();


    }

}
