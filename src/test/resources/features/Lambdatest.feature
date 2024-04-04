Feature: Lambdatest
  Scenario: Input form submit
    Given I navigate to lambdatest home page
    When I click Input Form Submit
    Then I enter all required data in form
    And I click submit
    Then I validate success message

  Scenario: Input form submit 2
    Given I navigate to lambdatest home page
    When I click Input Form Submit
    Then And I fill out the form with following information
      | name     | John          |
      | email    | jc@gmail.com  |
      | password | myFavPass     |
      | company  | Codefish      |
      | website  | Codefish.io   |
      | country  | United States |
      | city     | Des Plaines   |
      | address1 | 2200 E Devon  |
      | address2 | 351           |
      | state    | IL            |
      | zipCode  | 60018         |
    And I click submit
    Then I validate success message
