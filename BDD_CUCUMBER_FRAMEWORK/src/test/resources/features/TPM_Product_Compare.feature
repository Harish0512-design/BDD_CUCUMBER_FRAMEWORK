@SANITY
Feature: Product comparision
  As a user I want to compare two or more products so, that I can decide which product to buy.

  Scenario Outline: Verify that user is able to compare the products
    Given user launched the application
    When user clicks on "<menuItem>" menu
    Then verify page title "<pageTitle>"
    When user clicks on Add to Compare button for products "<product1>","<product2>"
    And user clicks on COMPARE button
    Then A pop-up window is opened and Verify "COMPARE PRODUCTS" as heading
    And Verify products "<product1>","<product2>" present in the pop-up window
    Then close the pop-up window

    Examples: 
      | menuItem | pageTitle | product1 | product2    |
      | Mobile   | Mobile    | IPhone   | Sony Xperia |
