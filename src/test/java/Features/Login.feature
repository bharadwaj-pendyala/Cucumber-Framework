@Login
Feature: User logs into Remo Ride Web Application

  @P1
  Scenario: User is able to login with valid credentials
    Given user is able to launch Application Under Test
    When user enters valid user name into username feild
    And user enters valid password and clicks on login button
    Then user should be successfully logged in and Dashboard page should be displayed
