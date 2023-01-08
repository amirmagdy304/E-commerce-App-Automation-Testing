@regression
Feature: F06_Hover Categories | users could hover on categories

  Scenario: SC6- Logged user could select different Categories
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user hover on Apparel category and open shoes sub category

    Then system display shoes items


  Scenario: SC7- Logged user could filter with color
    Given user go to home page
    And user go to login page
    And user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button

    When user hover on Apparel category and open shoes sub category
    And user filter by red color


    Then system display red shoes items