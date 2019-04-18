package com.qa19.wikiTests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        openSite();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){
        wd.quit();
    }

    public void openSite() {
        wd.get("https://wikipedia.org");
    }

    public void confirmLogin() {
        click(By.id("wpLoginAttempt"));
    }

    public void fillLoginForm(String user, String password) {
        type(By.name("wpName"), user);

        type(By.id("wpPassword1"), password);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initLogin() {
        click(By.id("pt-login"));
    }

    public void selectLanguage() {
        click(By.id("js-link-box-ru"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }


    public void clickOnStar() {
        click(By.cssSelector("[data-mw='interface']"));
    }

    public void searchArticle(String articleTitle) {
        type(By.id("searchInput"), articleTitle);
        click(By.id("searchButton"));
    }
    public void validLogin() {
        selectLanguage();
        initLogin();
        fillLoginForm("NastyaNastya66","korsarushka");
        confirmLogin();
    }
}
