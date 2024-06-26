Feature:CreateAccount salesforce application

@test10
Scenario: Create account 10

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Accounts"

Then User switchto popup window "accountspopup"

Then User Clicks on Button "popuptabClose"
Given User is on the "AccountsPage"
Then User Clicks on Button "NewTab"
When User enter into TextBox "AccName" "celenium apple"
Then User Clicks on Button "Type"
Then User Select from Dropdown "Type" "Technology Partner" 
Then User Clicks on Button "CustomePriority"
Then User Select from Dropdown "CustomePriority" "High" 
Then User Clicks on Button "Save1"

@test11
Scenario: Create account 11

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Accounts"
#Then User switchto popup window "accountspopup"
#Then User Clicks on Button "popuptabClose"
Then User Clicks on Button "createnewview"
When User enter into TextBox "viewname" "ABCD1"
When User enter into TextBox "viewuniquename" "EFGH2"
Then User Clicks on Button "save"


@test12
Scenario: Create account 12

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Accounts"
#Then User switchto popup window "accountspopup"
#Then User Clicks on Button "popuptabClose"
Then User Clicks on Button "viewdropdown"
Then User Select from Dropdown "viewdropdown" "All Accounts" 
Then User Clicks on Button "edit"
When User enter into TextBox "viewname" "All Accounts"
When User enter into TextBox "viewuniquename" "All Accounts"
Given User is on the "AccountsPage"
Then User Clicks on Button "FieldAccount"
Then User Select from Dropdown "FieldAccount" "Account Name" 
Then User Clicks on Button "operator"
Then User Select from Dropdown "operator" "contains" 
When User enter into TextBox "value" "a"
Then User Clicks on Button "save12"

@test14
Scenario: Create account 14

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Accounts"
#Then User switchto popup window "accountspopup"
#Then User Clicks on Button "popuptabClose"
Given User is on the "AccountsPage"
Then User Clicks on Button "Accountslastactivity30days"
Then User Clicks on Button "datefield"
Then User Clicks on Button "datefieldSelect"
Then User Clicks on Button "fromdate"
Then User Clicks on Button "today"
Then User Clicks on Button "todate"
Then User Clicks on Button "todatetoday"
Then User Clicks on Button "save14"
When User enter into TextBox "ReportUniquename" "newReport"
When User enter into TextBox "reportName" "new"
Then User Clicks on Button "Save14A"

@test13
Scenario: Create account 13

Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"
Then User Clicks on Button "Accounts"
#Then User switchto popup window "accountspopup"
#Then User Clicks on Button "popuptabClose"
Then User Clicks on Button "MergeAccounts"
Given User is on the "AccountsPage"
When User enter into TextBox "findAccTextbox" "ap"
Then User Clicks on Button "findAcc"
Then User Clicks on Button "Acc1"
Then User Clicks on Button "Acc2"
Then User Clicks on Button "next"
Then User Clicks on Button "merge"







