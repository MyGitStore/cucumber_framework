Feature: Random scenarios for salesforce

@test33
Scenario: Login into application and click on Home tab
#TestCase 32
Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Login"
Then User Clicks on Button "FirstNameLastName"

