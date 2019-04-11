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
        wd.findElement(By.linkText("//ru.wikipedia.org/")).click();
        //wd.findElement(By.className("central-featured-lang lang1")).click();

        //click to come in
        wd.findElement(By.linkText("https://ru.wikipedia.org/w/index.php?title=%D0%A1%D0%BB%D1%83%D0%B6%D0%B5%D0%B1%D0%BD%D0%B0%D1%8F:%D0%92%D1%85%D0%BE%D0%B4&returnto=%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F%3A%D0%9F%D0%BE%D0%B8%D1%81%D0%BA+%D0%BF%D0%BE+%D0%BA%D0%B0%D1%82%D0%B5%D0%B3%D0%BE%D1%80%D0%B8%D1%8F%D0%BC")).click();
        //type name
        wd.findElement(By.name("wpName")).click();
        wd.findElement(By.name("wpName")).clear();
        wd.findElement(By.name("wpName")).sendKeys("NastyaNastya66");
        //type password
        wd.findElement(By.name("wpPassword")).click();
        wd.findElement(By.name("wpPassword")).clear();
        wd.findElement(By.name("wpPassword")).sendKeys("korsarushka");

        wd.findElement(By.id("wpLoginAttempt")).click();

        wd.quit();


    }

}
