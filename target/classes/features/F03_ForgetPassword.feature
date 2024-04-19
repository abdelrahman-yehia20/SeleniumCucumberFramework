Feature: F02_Login | users could recover password when forget it
  Scenario: User could recover his password when entering the valid email
    Given User go to forget password page
    When User enter email "test@example.com"
    And user click on recover button
    Then Success message is displayed


  Scenario: user could not recover his email using invalid email
    Given User go to forget password page
    When User enter email "wrong@example.com"
    And user click on recover button
    Then Error message is displayed