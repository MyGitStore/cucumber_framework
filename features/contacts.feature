Feature: Contacts scenarios for salesforce

Background:
Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "contacts"

@test25
Scenario: Login into application and click on contacts
#TestCase 25
Then User Clicks on Button "popuptabClose"
Then User Clicks on Button "newbutton"
When User enter into TextBox "lastname" "last"
When User enter into TextBox "Accname" "apple1"
Then User Clicks on Button "Save"

@test26
Scenario: Login into application and click on contacts
#TestCase 26
Then User Clicks on Button "createnewview"
When User enter into TextBox "viewname" "sa2"
When User enter into TextBox "viewuniquename" "sa_2"
Then User Clicks on Button "save"

@test27
Scenario: Login into application and click on contacts
#TestCase 27
Then User Clicks on Button "recentlyviewedDD"
Then User Select from Dropdown "recentlyviewedDD" "Recently Created"

@test28
Scenario: Login into application and click on contacts
#TestCase 28
Then User Clicks on Button "viewdropdown"
Then User Select from Dropdown "viewdropdown" "My Contacts"

@test29
Scenario: Login into application and click on contacts
#TestCase 29
Then User Clicks on Button "recentContactname"

@test30
Scenario: Login into application and click on contacts
#TestCase 30
Then User Clicks on Button "createnewview"
When User enter into TextBox "viewuniquename" "CDEF"
Then User Clicks on Button "save"
And Validate Username "contactsError" "Error: You must enter a value"

@test31
Scenario: Login into application and click on contacts
#TestCase 31
Then User Clicks on Button "createnewview"
When User enter into TextBox "viewname" "ABCDE"
When User enter into TextBox "viewuniquename" "EFGHI"
Then User Clicks on Button "cancel"


@test32
Scenario: Login into application and click on contacts
#TestCase 32
Then User Clicks on Button "newbutton"
When User enter into TextBox "lastname" "Indian"
When User enter into TextBox "Accname" "Global Media"
Then User Clicks on Button "savenew"