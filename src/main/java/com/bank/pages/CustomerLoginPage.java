package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Logout']")
    WebElement logoutButton;
    @CacheLookup
    @FindBy(xpath="//span[@class='fontBig ng-binding']")
    WebElement yourName;

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Click on login button : " + loginButton);
    }

    public void verifyLogoutButtonDisplayed(){
        //Assert.assertTrue(logoutButton.isDisplayed());
        log.info("Log out button displayed : " + logoutButton);
    }

    public void clickOnLogOut(){
        clickOnElement(logoutButton);
        log.info("Click on Log out button : " + logoutButton);
    }

    public String verifyNameTextDisplayed(){
        log.info("Verify text : " + yourName.getText());
        return yourName.getText();
    }
}
