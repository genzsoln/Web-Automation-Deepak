
@test7
Feature: lh_connectProfile_basic_ffp

  Scenario Outline: <TestCase>
    Given User launches lufthansa web application
    And User handles privacy settings
    When User clicks on Login Button
    And User enters "<email>" address
    And User clicks on Next Button
    And User enters "<password>"
    Then User clicks on Log in Button
    And User clicks on Username
    And User clicks on My Profile
    And User clicks on Create account
    And User clicks on start upgrade
    And User corrects personal details and clicks on continue
# And User clicks on consent button and clicks on confirm and continue


    Examples:
      | email| password |
      | basic4upgrrade5@yopmail.com | Test@123 |