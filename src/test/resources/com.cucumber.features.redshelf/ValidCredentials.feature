Feature: Validating valid and invalid credentials
  Background: navigation to page
    Given the user navigate to the Red Shelf main page
    @1
  Scenario: Red Shelf login positive testing 1
    When the user provide valid username
    And the user provide valid password
    Then the user should see home page
    @2
    Scenario:logging in with invalid credentials
      When the user provide  invalid username "admin"
      And the user provide  invalid password "tester"
      Then the user validate text "The username/password combination is not valid."
      @3
      Scenario: logging in with only numerical credentials
      When the user provide username "1234"
      And the user provide password "4567"
      Then the user validate message "The username/password combination is not valid."




