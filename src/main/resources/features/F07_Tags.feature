@regression
Feature: F07_Search | users could search by tags

  Scenario: SC8- Logged user could select different tags
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user entered "Samsung" on the search text
    And user clicked on search

    And user click on apparel tag
    Then system display Products tagged with "apparel" tag
