package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Add Customer']")
    WebElement addCustomerButton;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Open Account']")
    WebElement openAccountButton;
//    @CacheLookup
//    @FindBy(xpath="")
//    WebElement customerButton;

    public void clickOnAddCustomerButton(){
        log.info("Clicked on add customer button : " + addCustomerButton);
        clickOnElement(addCustomerButton);
    }
    public void clickOnOpenAccountButton(){
        log.info("Clicked on open account button : " + openAccountButton);
        clickOnElement(openAccountButton);
    }


}
