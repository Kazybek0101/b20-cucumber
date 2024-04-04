Feature: Facebook login

  Scenario Outline: Invalid login
    Given I navigate to facebook login page
    When I enter invalid "<email>" email
    And I enter invalid "<password>" password
    Then I should get "<error>" error message

    Examples:
      | email              | password | error|
      | test12345@test.com | abcabcab | The email or mobile number you entered isn’t connected to an account. Find your account and log in.|

