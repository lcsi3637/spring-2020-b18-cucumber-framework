@loginWithBackground
Feature: Login feature
  CBT-25: As a user, I should be able to login with correct credentials
  to different accounts, and dashboard should be displayed.
  #this is how you comment in feature file


  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard


  Scenario: Student login scenario
    Given User is on the login page
    When User logs in as student
    Then User should see dashboard


  Scenario: Admin login scenario
    Given User is on the login page
    When User logs in as admin
    Then User should see dashboard