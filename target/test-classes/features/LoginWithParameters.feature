
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.

  Accounts are: librarian, student


  Background: Assuming user is on the  login page
    Given user is on the library login page


  Scenario: Login as Librarian
    When user enters librarian username "librarian2@library"
    And user enters librarian password "eb2VQKEj"




  Scenario: Login as student
    When user enters student username "student2@library"
    And user enters student password "80qynl9d"



    Scenario: Login as librarian same line
    When I login using as a username "librarian1@library" and as a password "rs4BNN9G"
    And there should be 23 'users'
#number can be whatever you have there