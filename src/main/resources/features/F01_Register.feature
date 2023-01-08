@regression
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page

    When user select gender type
    And user enter first name "Amir" and last name "Magdy"
    And user enter date of birth
    And user enter email "amirmagdy304@gmail.com" field
    And user entered valid company details
    And user fills Password fields "123456789" "123456789"
    And user clicks on register button

    Then success message is displayed


