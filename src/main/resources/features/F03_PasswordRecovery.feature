@regression
Feature: F03_Password Recovery | users could recover his password

  Scenario: SC3- User could reset his/her password successfully
    Given user go to password recovery page

    When user entered valid recovery email "amirmagdy304@gmail.com"
    And user clicked on recover button

    Then system send Email with instructions
