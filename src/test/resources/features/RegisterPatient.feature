Feature: Open MRS

  Scenario: Register new Patient
    Given I navigate to open mrs login page
    When I login with Admin
    Then I click register new patient
    Then I enter all required inofrmation
      | Name         | Kazybek       | Kadyrbaev |             |    |       |
      | Gender       | Male          |           |             |    |       |
      | Birthdate    | 05            | 10        | 1991        |    |       |
      | Address      | E Devon 2200  | s351      | Des Plaines | IL | 60018 |
      | Phone Number | 7739805503    |           |             |    |       |
      | Relatives    | Patient, John |           |             |    |       |
      | Confirm      |               |           |             |    |       |


