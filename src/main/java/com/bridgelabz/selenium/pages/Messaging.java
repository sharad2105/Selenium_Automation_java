package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messaging {
    @FindBy (xpath = "//*[@id='ember34']/span")
    WebElement messagebtn;
    public Messaging(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void openMessaging() throws InterruptedException {

        messagebtn.click();
        Thread.sleep(50000);

        return;
    }
}
