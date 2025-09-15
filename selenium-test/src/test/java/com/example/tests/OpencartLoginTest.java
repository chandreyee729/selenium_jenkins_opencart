package com.example.tests;



public class OpencartLoginTest extends BaseTest {


    public void opencartLoginTest() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
    }   
    public void tearDown() {
        driver.quit();
    }
    
}
