package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Deposit']")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement amountTextbox;
    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath="//span[@class='error ng-binding']")
    WebElement textDepositSuccess;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Withdrawl']")
    WebElement withdrawalTab;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Withdraw']")
    WebElement withdrawButton;
    @CacheLookup
    @FindBy(xpath="//span[@class='error ng-binding']")
    WebElement textTransactionSuccess;

    public void clickOnDepositTab(){
        log.info("Click on deposit tab " + depositTab);
        clickOnElement(depositTab);
    }
    public void enterAmount(String amt){
        sendTextToElement(amountTextbox,amt);
        log.info("Enter Amount " + amountTextbox);
    }
    public void clickOnDepositeButton(){
        clickOnElement(depositButton);
        log.info("Click on deposite button " + depositButton);
    }
    public String getTextDepositeSuccess(){
        log.info("Get text  " + depositButton);
        return getTextFromElement(textDepositSuccess);
    }
    public void clickOnWithdrawalTab(){
        clickOnElement(withdrawalTab);
        log.info("Click on withdrawal tab " + depositButton);
    }
    public void clickOnWithdrawButton(){
        clickOnElement(withdrawButton);
        log.info("Click on withdrawal Button " + withdrawButton);
    }
    public void verifyTextTransactionSuccess(){
        Assert.assertEquals(getTextFromElement(textTransactionSuccess),getTextFromElement(textTransactionSuccess),"Error");
        log.info("Get text " + textTransactionSuccess);
    }

}
