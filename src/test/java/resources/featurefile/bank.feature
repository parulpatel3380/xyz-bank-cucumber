Feature: Bank Test Functionality

  Background:
    Given I am on the homepage

  Scenario: Bank manager should add customer successfully
    When I click on 'Bank Manager Login' tab
    And  I click on 'Add Customer' tab
    And  Enter FirstName
    And  Enter LastName
    And  Enter Postcode
    And  click on 'Add Customer' Button
    And  popup display
    Then I can see message "Customer added successfully"
    And  I click on 'OK' button on pop up

  Scenario: Bank  manager should open account successfully
    When I click on 'Bank Manager Login' tab
    And  I click on 'Open Account' tab
    And  I search customer
    And  I select currency "Pound"
    And  I click on 'process' button
    And  popup display
    Then I can see message "Account created successfully"
    And  I click on 'OK' button on pop up

  Scenario: Customer should login and logout successfully
    When I click on 'Customer Login' tab
    And  I search customer
    And  I click on 'Login' Button
    Then I can see 'Logout' tab
    Then I can see 'Your Name' text displayed
    And  I click on 'Logout'
  @sanity
  Scenario: Customer should deposit money successfully
    When I click on 'Customer Login' tab
    And  I search customer
    And  I click on 'Login' Button
    And  I click on 'Deposit' tab
    And  I enter amount "100"
    And  I click on 'Deposit' Button
    Then I can see message 'Deposit Successful'
  @sanity
  Scenario: Customer should withdraw money successfully
    When I click on 'Customer Login' tab
    And  I search customer
    And  I click on 'Login' Button
    And  I click on 'Withdrawal' tab
    And  I enter amount "50"
    And  I click on 'Withdraw' button
    Then I can see message 'Transaction Successful'
