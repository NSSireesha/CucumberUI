Feature: Logout feature
@Logout
Scenario: Logout for Online shopping application
Given User is successfully logged in
When user clicks on signout button
Then Successful logout message should be displayed