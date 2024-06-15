Feature: Register for online shopping application
  @Registration
  Scenario Outline: Register a new account
    Given user is on registration page
    When "<Username>" ,  "<Password>" and "<Email>" are entered
    And submit button is clicked
Then Registration success message should be shown

    Examples:

      | Username | Password | Email          |
      | user1    | pass1    | user1@aabc.com |
      | user2    | pass2    | user2@abc.com  |