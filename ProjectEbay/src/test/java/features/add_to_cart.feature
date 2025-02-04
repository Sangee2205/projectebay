Feature: Add a book to the cart on eBay

  Scenario: Verify item can be added to the cart
    Given I open the eBay homepage
    When I search for "book" and press Enter
    And I click on the first book in the search results
    And I add the book to the cart
    Then I should see the cart updated with "1" item