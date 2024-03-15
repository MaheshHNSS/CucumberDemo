Feature: login functionality of bank app

  @banklogin
  Scenario: Successful login
    Given user is on bank login page
    When user enters valid details
    Then he is on home page

    @demo_scenariooutline
  Scenario Outline: Home page links
    Given user is on bank login page
    And user enters valid details
    When he is on home page
    And click on '<link>'
    Then verify '<url>'

    Examples:
      | link    | url                                                            |
      | New Customer  |https://demo.guru99.com/V1/html/addcustomerpage.php|
      | Edit Customer |https://demo.guru99.com/V1/html/EditCustomer.php             |
      | Delete Customer    | https://demo.guru99.com/V1/html/DeleteCustomerInput.php            |