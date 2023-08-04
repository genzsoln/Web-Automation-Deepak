
@test3
Feature: Calculate Baggage

  Scenario Outline: <TestCase>

    Given User launches lufthansa web application
    And User handles privacy settings
    And User clicks on prepare for your trip
    And User clicks on Baggage section
    And User scroll up the page
#    And User clicks on to the calculator tab
#    And User enters origin
#    And User able to enters destination
#    And User clicks on calculate button
#    And User scroll the page up

    Examples:
      | TestCase      |
      | lh_Login_Flow |