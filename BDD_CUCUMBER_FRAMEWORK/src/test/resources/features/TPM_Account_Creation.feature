@ACCOUNTCREATION
Feature: Account creation
  As a user, I want to create an account by registering myself in tha application. 
  So that I can buy the products, share my wishlist to others.

  Scenario: Verify account creation and sharing the wishlist.
    As a user, I want to create a new account with valid credentials and add the products
    to the wishlist and share the wishlist to others via email.

    Given user launched the application
    When user clicks on ACCOUNT
    And user selects "Register"
    Then verify page title "Create New Customer Account"
    When user enters following details in the registration form
      | firstName       | Harish                  |
      | lastName        | S                       |
      | email           | harishsomsole@gmail.com |
      | password        | Admin@123               |
      | confirmPassword | Admin@123               |
    And user clicks on register button
    Then verify success message "Thank you for registering with Main Website Store."
    When user clicks on "TV" menu
    And user selects "LG LCD" to the wishlist
    And user clicks on Share Wishlist
    And user enter email and message
      | email   | harishsomsole12@gmail.com      |
      | message | Hi Harish, this is my wishlist |
    And user clicks on share wishlist in wishlist sharing page
    Then verify success message "Your Wishlist has been shared." in wishlist page
