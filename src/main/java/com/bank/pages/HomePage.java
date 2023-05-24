package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginButton;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Customer Login']")
    WebElement customerLoginButton;

    public void clickOnBankManagerLoginTab(){
        log.info("Clicked on bank manager login button : " + bankManagerLoginButton);
        clickOnElement(bankManagerLoginButton);
    }
    public void clickOnCustomerLoginTab(){
        log.info("Clicked on customer login button : " + customerLoginButton);
        clickOnElement(customerLoginButton);
    }
}
