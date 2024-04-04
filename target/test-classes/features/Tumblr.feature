Feature: Tumblr.com

  Scenario Outline: Invalid login
    Given I navigate to tumblr home page
    When I click to login button
    And I click continue with email
    And I enter "<email>" email
    And I enter "<password>" password
    Then I should get "Your email or password were incorrect." error

    Examples:
      | email         | password |
      | test@test.com | abcabc   |
      | test@test.com | 123456   |
      | test@test.com | !@#$!@#$ |

