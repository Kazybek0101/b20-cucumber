Feature: Sauc Swag

  Background:
    Given I navigate to saucedemo home page

  Scenario: Login with valid username
    When I should log in
    Then print out all item names from page

    Scenario: Login with locked user
      When I login with locked username and password
      Then I should get error message

      Scenario: Login with visual user
        When I login with visual user username and password
        Then I should see "onesie" item
        And  price should be 7.99

        Then I select the item
        Then Print the price and add to cart and go to cart
        Then I validate Sauce Labs Onesie item

