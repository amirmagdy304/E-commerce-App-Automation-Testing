@regression
Feature: F08_Cart | users could add to his shopping cart

  Scenario: SC9- Logged user could add different products to Shopping cart
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user entered "Samsung" on the search text
    And user clicked on search
    And user add samsung laptop to cart
    Then system add the item successfully to the cart

    When user click on apparel tag
    And user add oversized women T-shirt to the cart
    Then system add the item successfully to the cart
    And system increase cart Qty