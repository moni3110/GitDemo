Feature: Application Login

@RegTest
Scenario: Home page defult login
Given User is on Netbanking landing page
When User login into application with "Moni" and "4321"
Then Home page is populated
And Crards displayed are "true"

@SmokeTest
Scenario: Home page defult login
Given User is on Netbanking landing page
When User login into application with "Ritu" and "1234"
Then Home page is populated
And Crards displayed are "false"

@RegTest
Scenario: Home page defult login
Given User is on Netbanking landing page
When User sign up with following details
| Riji | abdc | riji@cbd.com | 402 paly hills | 422001 |
Then Home page is populated
And Crards displayed are "false"

@SmokeTest
Scenario Outline: Home page defult login
Given User is on Netbanking landing page
When User login on application with <UserName> and <Password>
Then Home page is populated
And Crards displayed are "false"

Examples:
| UserName | Password | 
| Riji1    | abdc1    |
| Riji2    | abdc2    |
| Riji3    | abdc3    |
| Riji4    | abdc4    |
| Riji5    | abdc5    |
