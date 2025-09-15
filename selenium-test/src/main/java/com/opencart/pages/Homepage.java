package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private final WebDriver driver;
    private final String LINK_TO_REGISTER = "a[href*='account/register']";
    private final String LINK_TO_LOGIN = "//a[contains(@href,'account/login')]";

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }   

    private final By account = By.xpath("//a[@title='My Account']");
    private final By register = By.cssSelector(LINK_TO_REGISTER);
    private final By login = By.xpath(LINK_TO_LOGIN);

    public void clickOnMyAccount() {
        driver.findElement(account).click();
    }   
    public void clickOnRegister() {
        driver.findElement(register).click();
    }
    public void clickOnLogin() {
        driver.findElement(login).click(); 
    }
    
}
