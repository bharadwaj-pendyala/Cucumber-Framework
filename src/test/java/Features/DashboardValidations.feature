@Login
Feature: Validating Dashboard Page

  @P1
  Scenario: Verifying loan details tailored based on risk profile of user
    Given user is able to launch Application Under Test
    When user enters valid user name into username feild
    And user enters valid password and clicks on login button
    Then user should be successfully logged in and Dashboard page should be displayed
    When user verifies the loan details suggested
    Then loan details should be displayed with description and proceed button for selection
