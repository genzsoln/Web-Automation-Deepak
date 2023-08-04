@test
Feature: lh_Login



  Scenario Outline: <TestCase>
    Given User launches lufthansa web application
    And User handles privacy settings
    And User clicks on Login and Register Button
    And User enters Email address
    And User clicks on Next Button
    And User enters Password
    And User clicks on Log in Button
  #  And User clicks on Username
    #And User clicks on My Account
  #  When User clicks on Log in
  # Then User get logged_in



    Examples:
      | TestCase      |
      | lh_Login_Flow |
