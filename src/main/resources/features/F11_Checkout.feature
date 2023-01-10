@regression
Feature: F08_Cart | users could add to his shopping cart

  Scenario: SC12- Create successful Order
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user entered "Samsung" on the search text
    And user clicked on search
    And user add samsung laptop to cart
    Then system add the item successfully to the cart

    When user click on apparel tag
    And user add oversize women T-shirt to the cart
    Then system add the item successfully to the cart
    And system increase cart Qty

    When user press on shopping cart button
    Then the system will open the cart page

    When user click on agree terms and checkout button
    Then the system will open the checkout page

    When user fill Billing address information
    And user select the ground shipping method
    And user select check_money order payment method
    And user select the payment information
    And user click on confirm
    Then the system will display successful order message

