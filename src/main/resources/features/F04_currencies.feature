Feature: User is able to change the currency
  Scenario: user change the currency to euro
    When user select euro from drp
    Then All products price should be displayed with euro