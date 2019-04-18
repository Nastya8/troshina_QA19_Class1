package com.qa19.wikiTests1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationsTests extends TestBase {

@Test
    public void readNotification(){
    validLogin();
    clickOnNotificationIcon();
    clickOnButtonAllNotifications();

    String pageTitle = wd.findElement(By.cssSelector("h1")).getText();

    Assert.assertEquals(pageTitle,"Уведомления");
}

    public void clickOnButtonAllNotifications() {
    click(By.cssSelector("[class='oo-ui-iconElement-icon oo-ui-icon-next']"));
    }

    public void clickOnNotificationIcon() {
    click(By.id("pt-notifications-notice"));
    }
}
