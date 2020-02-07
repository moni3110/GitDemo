Feature: Application Login

@RegTest
Scenario: Home page defult login
Given User is on Netbanking landing page
When User login into application with "Moni" and "4321"
Then Home page is populated
And Crards displayed are "true"

