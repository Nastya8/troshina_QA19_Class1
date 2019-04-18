package com.qa19.wikiTests1;

import org.testng.annotations.Test;

public class AddToFavoritesTest extends TestBase {

    @Test
    public void testAddToFavorites() {

        validLogin();
        searchArticle("Game of Thrones");
    clickOnStar();

    }



}
//search "Game of Thrones"
// wd.findElement(By.id("searchInput")).click();
// wd.findElement(By.id("searchInput")).clear();
// wd.findElement(By.id("searchInput")).sendKeys("Game of Thrones");
//     //button search
//   wd.findElement(By.id("searchButton")).click();
//    //put to favorites
//        wd.findElement(By.cssSelector("[data-mw='interface']")).click();