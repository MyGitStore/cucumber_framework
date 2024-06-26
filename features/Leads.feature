Feature: Leadds scenarios for salesforce

Background:
Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Leads"

@test20
Scenario: Login into application and click on LeadsTab
#Then User Clicks on Button "Leads"

@test21
Scenario: Login into application and validate leads dropdown
Then User switchto popup window "accountspopup"
Then User Clicks on Button "popuptabClose"
Given User is on the "LeadsPage"
Then User Clicks on Button "LeadsDropdown"
Then validate dropdown is displayed Leads
| All Open Leads | My Unread Leads | Recently Viewed Leads |Today's Leads | View - Custom 1 | View - Custom 2 | 
@test23
Scenario: Login into application and click on LeadsTab
Given User is on the "LeadsPage"
Then User Clicks on Button "LeadsDropdown"
Then User Clicks on Button "Todays Leads"
#Then User Clicks on Button "Gobutton"

@test24
Scenario: Login into application and in leads page given new info and saved
Given User is on the "LeadsPage"
Then User Clicks on Button "new"
When User enter into TextBox "lastname" "ABCD"
When User enter into TextBox "companyName" "ABCD"
Then User Clicks on Button "save"

@test22
Scenario: Login into application and click on LeadsTab
#Then User Clicks on Button "popuptabClose"
Given User is on the "LeadsPage"

Then User Clicks on Button "LeadsDropdown"
Then User Clicks on Button "MyunreadLeadsfromdropdown"
Given User is on the "HomePage"
Then User Clicks on Button "Usermenu"
Then User Clicks on Button "Logout"
Given User is on the "LoginPage"
Then wait for loading
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Leads"
#Then User Clicks on Button "Gobutton"
Then User validates default view selected "view" "My Unread Leads"


