@REGRESSION
Feature: Sorting mobile products
  As a user I want to sort mobile products by their name and price.

  Background: 
    Given user launched the application
    Then verify page title "Home page"
    When user clicks on "Mobile" menu
    Then verify page title "Mobile"

  Scenario: Verify Items in mobile list page should be sorted by name using upper SortBy
    When user selects "Name" from the upper sortBy dropdown
    Then verify items are sorted in ascending order

  Scenario: Verify Items in mobile list page should be sorted by name using lower SortBy
    When user selects "Name" from the lower sortBy dropdown
    Then verify items are sorted in ascending order
