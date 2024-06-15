Feature: Login feature
  @Login
  Scenario Outline: Login Feature for Online shopping application
    Given User is on Login page
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then Homepage should appear

    Examples:
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | nonuser1 | pass3    |

