@regression
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: SC2- user could login with valid email and password
    Given user go to login page

    When user login with "amirmagdy304@gmail.com" and "123456789"
    And user press on login button
    Then user login to the system successfully

#-------------------------------------------------------------------
  Scenario: user could login with invalid email and password
    Given user go to login page

    When user login with "wrongemail@example.com" and "P@ssw0rd"
    And user press on login button
    Then user could not login to the system


