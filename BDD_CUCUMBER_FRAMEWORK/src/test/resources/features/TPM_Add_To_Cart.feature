Feature: Add to cart feature
  
  As a user I want to add product to the cart so that I can update the quanity,
  see the total price, apply discount and buy the product

  Scenario Outline: Verify user cannot add more product to cart than it is available in store
    Given user launched the application
    When user clicks on "<MenuItem>" menu
    And user clicks on ADDTOCART for "<Product>"
    And user update the quantity by "1000"
    Then verify error message "<ErrorMessage>"
    When user clicks on EMPTYCART in the cart page
    Then Verify the message "SHOPPING CART IS EMPTY"

    Examples: 
      | MenuItem | Product     | ErrorMessage                                                  |
      | Mobile   | IPhone      | Some of the products cannot be ordered in requested quantity. |
      | Mobile   | Sony Xperia | The requested quantity for Sony Xperia is not available.      |
      | Mobile   | LG LCD      | Some of the products cannot be ordered in requested quantity. |
