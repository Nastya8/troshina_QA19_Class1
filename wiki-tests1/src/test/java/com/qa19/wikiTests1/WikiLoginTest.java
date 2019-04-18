package com.qa19.wikiTests1;

import org.testng.annotations.Test;



public class WikiLoginTest extends TestBase{

    @Test
        public void testLogin() {

        selectLanguage();
        initLogin();
        fillLoginForm("NastyaNastya66", "korsarushka");
        confirmLogin();


    }


}


