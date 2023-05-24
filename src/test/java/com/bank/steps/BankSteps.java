package com.bank.steps;

import com.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }

    @When("^I click on 'Bank Manager Login' tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("^I click on 'Add Customer' tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerButton();
    }

    @And("^Enter FirstName$")
    public void enterFirstName() {
        new AddCustomerPage().enterFirstName("Amanda");
    }

    @And("^Enter LastName$")
    public void enterLastName() {
        new AddCustomerPage().enterLastName("Yately");
    }

    @And("^Enter Postcode$")
    public void enterPostcode() {
        new AddCustomerPage().enterPostcode("se4 3je");
    }

    @And("^click on 'Add Customer' Button$")
    public void clickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("^popup display$")
    public void popupDisplay() {
        new AddCustomerPage().popUpDisplay();
    }

    @Then("^I can see message \"([^\"]*)\"$")
    public void iCanSeeMessage(String expected)  {
        new AddCustomerPage().verifyMessage(expected);
    }

    @And("^I click on 'OK' button on pop up$")
    public void iClickOnOKButtonOnPopUp() {
        new AddCustomerPage().clickOnPopUp();
    }

    @And("^I click on 'Open Account' tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountButton();
    }

    @And("^I search customer$")
    public void iSearchCustomer() {
        new OpenAccountPage().clickAndSelectCustomerFromDropDown();
    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency)  {
        new OpenAccountPage().clickAndSelectCurrencyFromDropDown();
    }

    @And("^I click on 'process' button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @When("^I click on 'Customer Login' tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("^I click on 'Login' Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^I can see 'Logout' tab$")
    public void iCanSeeLogoutTab() {
        new CustomerLoginPage().verifyLogoutButtonDisplayed();
    }


    @And("^I click on 'Logout'$")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOut();
    }

    @Then("^I can see 'Your Name' text displayed$")
    public void iCanSeeYourNameTextDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().verifyNameTextDisplayed(),"Harry Potter","Error");
    }

    @And("^I click on 'Deposit' tab$")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter amount (\\d+)$")
    public void iEnterAmount(int arg0) {

    }

    @And("^I click on 'Deposit' Button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositeButton();
    }

    @Then("^I can see message 'Deposit Successful'$")
    public void iCanSeeMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().getTextDepositeSuccess(),"Deposit Successful","Error");
    }

    @And("^I click on 'Withdrawal' tab$")
    public void iClickOnWithdrawalTab() {
        new AccountPage().clickOnWithdrawalTab();
    }

    @And("^I click on 'Withdraw' button$")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawButton();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount)  {
        new AccountPage().enterAmount(amount);
    }

    @Then("^I can see message 'Transaction Successful'$")
    public void iCanSeeMessageTransactionSuccessful() {
        new AccountPage().verifyTextTransactionSuccess();
    }
}
