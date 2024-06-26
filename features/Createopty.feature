Feature:CreateAccount salesforce application/ Creates Oppurtunity

Background:
Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"

@test15
Scenario: Create Opportunity 15
Then User Clicks on Button "Opportunity"
Then User switchto popup window "accountspopup"
Then User Clicks on Button "popuptabClose"
Then User Clicks on Button "MyopporDropdown"
Then validate dropdown is displayed Createopty
| All Opportunities |  Closing Next Month |  Closing This Month |  My Opportunities | New Last Week | New This Week| Opportunity Pipeline| Private| Recently Viewed Opportunities| Won|

@test16
Scenario: Create Oppurtunity 16
Then User Clicks on Button "Opportunity"
Then User Clicks on Button "Newbutton"
Given User is on the "CreateOptyPage"
When User enter into TextBox "OpporName" "test"
When User enter into TextBox "AccName" "sa 1"
Then User Clicks on Button "closedate"
Then User Clicks on Button "today"
Then User Clicks on Button "stage"
Then User Select from Dropdown "stage" "Needs Analysis" 
When User enter into TextBox "probability" "10"
Then User Clicks on Button "leadsource"
Then User Select from Dropdown "leadsource" "Web"
When User enter into TextBox "primarycamp" "Web"
Then User Clicks on Button "save"

@test17
Scenario: Create Oppurtunity 17
Then User Clicks on Button "Opportunity"
Then User Clicks on Button "OpporPipeline"

@test18
Scenario: Create Oppurtunity 18
Then User Clicks on Button "Opportunity"
Then User Clicks on Button "stuckoppor"

@test19
Scenario: Create Oppurtunity 19
Then User Clicks on Button "Opportunity"
Then User Clicks on Button "QuaterlysummaryInterval"
Then User Select from Dropdown "QuaterlysummaryInterval" "Current FQ"
Then User Clicks on Button "QuaterlysummaryInclude"
Then User Select from Dropdown "QuaterlysummaryInclude" "All Opportunities"
Then User Clicks on Button "Runreport"

