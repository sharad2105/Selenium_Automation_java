package com.bridgelabz.selenium.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Base{
    public static WebDriver driver;
    @BeforeTest
    public void setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(
                2000
        );
        driver.close();
    }
}
