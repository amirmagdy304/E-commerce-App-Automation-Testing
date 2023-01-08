@regression
Feature: F04_Search | users could search for products

  Scenario: SC4- Logged User could search for any product
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user entered "Samsung" on the search text
    And user clicked on search

    Then system display filtered items