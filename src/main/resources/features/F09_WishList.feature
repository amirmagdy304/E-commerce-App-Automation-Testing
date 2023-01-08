@regression
Feature: F09_WishList | users could add to his WishList

  Scenario: SC10- Logged user could add different products to Wishlist
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user entered "Samsung" on the search text
    And user clicked on search
    And user add samsung laptop to wishlist
    Then system add the item successfully to the wishlist

    When user click on apparel tag
    And user add oversized women T-shirt to the wishlist
    Then system add the item successfully to the wishlist
    And system increase wishlist Qty