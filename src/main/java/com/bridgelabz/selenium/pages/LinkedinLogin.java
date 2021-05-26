package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinLogin extends Base{


    @FindBy(id = "username")
    WebElement email;

    @FindBy(id = "password")
    WebElement pass;

    @FindBy(xpath = "//*[@id=\"organic-div\"]/form/div[3]/button")
    WebElement signInButton;
    public LinkedinLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void loggedInToApp() throws InterruptedException {
        email.sendKeys("patilsharad2000@gmail.com");
        pass.sendKeys("Sharad@1998");
        signInButton.click();
        Thread.sleep(5000);

        return;
    }


}
