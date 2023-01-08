@regression
Feature: F05_Currency | users could switch currencies

  Scenario: SC5- Logged User could switch between currencies US-Euro
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user change the currency to Euro

    Then system change price to Euro