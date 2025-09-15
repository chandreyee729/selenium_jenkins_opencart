package com.opencart.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
    
    protected  WebDriver driver;
    public String baseUrl = "https://naveenautomationlabs.com/opencart/index.php?route=common/home";

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("");
        System.out.println("----- Browser launched -----");
        System.out.println("");
    }
    @AfterMethod
    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }

}
