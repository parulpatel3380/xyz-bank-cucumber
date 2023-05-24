package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Post Code']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement addCustomerButton;


    public void enterFirstName(String fname){
        sendTextToElement(firstName,fname);
        log.info("Send text to First name Text box : " + fname);
    }

    public void enterLastName(String lname){
        sendTextToElement(lastName,lname);
        log.info("Send text to Last name Text box : " + lname);
    }

    public void enterPostcode(String post){
        sendTextToElement(postCode,post);
        log.info("Send text to Postcode Text box : " + post);
    }

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
        log.info("Clicked on add customer button : " + addCustomerButton);
    }

    public String popUpDisplay(){
        log.info(" Pop up Display ");
        return getTextFromAlert();
    }

    public void verifyMessage(String expected){
        String actual=getTextFromAlert().trim();
        boolean expectedResult=actual.contains(expected);
        log.info("Verifying message ' " + actual + " ' ");
        Assert.assertTrue(expectedResult);
    }

    public void clickOnPopUp(){
        acceptAlert();
    }
}
