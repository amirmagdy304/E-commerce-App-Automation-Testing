@regression
Feature: F09_Compare List | users could add items to his compare list

  Scenario: SC11- Logged user could add different products to compare list
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user entered "Samsung" on the search text
    And user clicked on search
    And user add samsung laptop to compare list
    Then system add the item successfully to the compare list

    When user click on apparel tag
    And user add oversize women T-shirt to the compare list
    Then system add the item successfully to the compare list