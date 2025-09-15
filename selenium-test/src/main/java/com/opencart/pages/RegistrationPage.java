package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    // locators for registration page
    private By firstname = By.id("input-firstname");
    private By lastname = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmpassword = By.id("input-confirm");
    private By checkbox = By.name("agree");
    private By continuebutton = By.xpath("//input[@value='Continue']");

////*[@id="content"]/form/div/div/input[1]

    public void enterFirstName(String fname) {
        driver.findElement(firstname).sendKeys(fname);
    }  
    public void enterLastName(String lname) {
        driver.findElement(lastname).sendKeys(lname);
    }
    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }  
    public void     enterTelephone(String phone) {
        driver.findElement(telephone).sendKeys(phone);
    }
    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }
    public void enterConfirmPassword(String pwd) {
        driver.findElement(confirmpassword).sendKeys(pwd);
    }
    public void clickOnCheckbox() {
        driver.findElement(checkbox).click();
    }
    public void clickOnContinueButton() {
        driver.findElement(continuebutton).click(); 
    }

}

