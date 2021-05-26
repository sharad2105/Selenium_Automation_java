package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    @FindBy(xpath = "//*[@id=\"ember17\"]/input")
    WebElement search;

    public Search(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setSearch() throws InterruptedException {

        search.sendKeys("tcs jobs");
        Thread.sleep(5000);

        return;
    }
}
