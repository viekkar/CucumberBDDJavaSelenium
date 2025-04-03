Feature: Validate the login functionality
  Scenario: Validate login for valid creds
    Given Launch the chrome browser
    And Naviagte to the goole url
    When Maximize the window
    And Enter valid username and password
    Then Valiadte user is login successfully