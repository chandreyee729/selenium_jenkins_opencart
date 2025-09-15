package com.opencart.tests;
import org.testng.annotations.Test;

import com.opencart.base.BaseTest;


public class VisitOpencartTest extends BaseTest {
    
    @Test
    public void visitOpencart() {
        driver.get(baseUrl);
        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
    }
}
