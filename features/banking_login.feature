Feature: login functionality of bank app

  @banklogin
  Scenario: Successful login
    Given user is on bank login page
    When user enters valid details
    Then he is on home page