Feature: Bookcart Application Test

Scenario: 
Login should be successful

Given User navigate to the Swag Labs application
And User enter user name as standard_user
And User enter password as secret_sauce
When User click on login button
Then Login should be success
