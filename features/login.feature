Feature: Login Feature

  @login @successfullogin
  Scenario: Successful login scenario
    Given user is on login page
    When he enters valid credentials
    And click on signin button
    Then verify he is on home page
    And verify profile icon

  @login @failedlogin
  Scenario: Login scenario with invalid credentials
    Given user is on login page
    When he enters invalid credentials
    And click on signin button
    Then verify error message