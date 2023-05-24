package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Open Account']")
    WebElement openAccountTab;
    @CacheLookup
    @FindBy(id="userSelect")
    WebElement customerDropDown;
    @CacheLookup
    @FindBy(id="currency")
    WebElement currency;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Process']")
    WebElement processButton;


    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountTab);
        log.info("Click on open account tab : " + openAccountTab);
    }
    public void clickAndSelectCustomerFromDropDown(){
        clickOnElement(customerDropDown);
        selectByVisibleTextFromDropDown(customerDropDown,"Harry Potter");
        log.info("Click on customer dropdown : " + customerDropDown);
    }
    public void clickAndSelectCurrencyFromDropDown(){
        clickOnElement(currency);
        log.info("Click on  currency : " + currency);
        selectByValueFromDropDown(currency,"Pound");
    }
    public void clickOnProcessButton(){
        clickOnElement(processButton);
        log.info("Click process button : " + processButton);
    }

}
