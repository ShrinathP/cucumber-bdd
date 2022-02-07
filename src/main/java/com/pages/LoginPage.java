package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {

    private WebDriver driver;

    //1. By Locators
    @FindBy(id = "email")
    private WebElement email;

    //@FindBys
    //Multiple FindBy with AND
    @FindBys({
            @FindBy(className = "custom-control-check-box"),
            @FindBy(id = "game-chk-box")
    })
    WebElement element2;

    //@FindAll
    //Multiple FindBy with OR
    @FindAll({
            @FindBy(id = "btn"), //doesn't match
            @FindBy(name = "sbmtBtn"), //Matches
            @FindBy(className = "btn-primary") //doesn't match
    })
    WebElement element3;

    @CacheLookup
    //very useful when you are referring to the same web element multiple times
    @FindBy(id="submit")
    WebElement chkBox;
    /*
    Using @CacheLookup annotation,
    we will be losing one of the page factory benefit as it will find the element once
    and then keep a reference to it, hence, we are more likely to see StaleElementExceptions.
    */

    private By password = By.className("className");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean isForgotPwdLinkExist() {
        return driver.findElement(password).isDisplayed();
    }

    public void enterUserName() {

    }

    public void enterPassword() {

    }

    public void clickOnLogin() {
        //click on Login Button
    }
}
