package com.opencart.tests;
import com.opencart.base.BaseTest;
import com.opencart.pages.Homepage;
import com.opencart.pages.RegistrationPage;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistertoOpencartTest extends BaseTest {
    // declare page objects and wait
    WebDriverWait wait;
    Homepage homepage;
    RegistrationPage registrationpage;  
    Logger logger = org.slf4j.LoggerFactory.getLogger(RegistertoOpencartTest.class);

    // random integer to generate unique email id and telephone number
    Random random = new Random();
    int randomInt = random.nextInt(1000);  
    public String email = "John.Wick" + randomInt  + "@mailinator.com";
    int randomTelephone = random.nextInt(1000000000);

    @BeforeMethod
    public void pageSetup() {
        // initialize page objects after driver is ready
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homepage = new Homepage(driver);
        registrationpage = new RegistrationPage(driver);
        System.out.println("");
        System.out.println("----- Starting Test: RegistertoOpencartTest -----");
        System.out.println("Random email generated: " + email);
    }

    @Test
    public void registerToOpencart() {
        driver.get(baseUrl);
    
        homepage.clickOnMyAccount();
        homepage.clickOnRegister();
        wait.until(d -> d.getCurrentUrl().contains("register"));
        driver.getPageSource().contains("Register Account");

        registrationpage.enterFirstName("John");
        registrationpage.enterLastName("Wick");
        registrationpage.enterEmail(email);
        registrationpage.enterTelephone(Integer.toString(randomTelephone));
        registrationpage.enterPassword("John@123");
        registrationpage.enterConfirmPassword("John@123");
        registrationpage.clickOnCheckbox();
        registrationpage.clickOnContinueButton();
        wait.until(d -> d.getCurrentUrl().contains("account/success"));
        driver.getPageSource().contains("Your Account Has Been Created!");
        logger.info("Registration completed for email: " + email);


    }
    
}
