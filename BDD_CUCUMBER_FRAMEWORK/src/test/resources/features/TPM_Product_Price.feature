@REGRESSION
Feature: Product price Comparision
  compare the price of a product in list page should equal to the product in details page

  Scenario Outline: Verify price in product list page is same as price in details page[Regular Price] - Mobiles
    Given user launched the application
    When user clicks on "Mobile" menu
    Then verify page title "Mobile"
    And note the price value of "<mobileName>" in product list page
    When user clicks on "<mobileName>" from products list
    Then verify page title "<pageTitle>"
    And verify "<mobileName>" price in product details page is same as in product list page

    Examples: 
      | mobileName     | pageTitle               |
      | IPhone         | IPhone - Mobile         |
      | Samsung Galaxy | Samsung Galaxy - Mobile |
      | Sony Xperia    | Sony Xperia - Mobile    |
