Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.

  Accounts are: librarian, student


  Background: Assuming user is on the  login page
    Given user is on the library login page


  Scenario: Login as Librarian
    When user enters librarian username
    And user enters librarian password




  Scenario: Login as student
    When user enters student username
    And user enters student password
