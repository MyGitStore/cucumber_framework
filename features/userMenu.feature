Feature: userMenu drop down

Background:
Given User is on the "LoginPage"
When User enter into TextBox "Username" "SathyaHariram@tekarch.com" 
When User enter into TextBox "Password" "Mysalesforce@222"
Then User Clicks on Button "Login"
Given User is on the "HomePage"

Scenario: user clicks on usermenu 5

Then User Clicks on Button "Usermenu"

@test6
Scenario: User shares a profile picture6
Then User Clicks on Button "Usermenu"
Then User Clicks on Button "MyProfile"
Given User is on the "MyProfilePage"
Then User Clicks on Button "EditProfile"
Then User Switch frame "EditProfilepopupframe"
Then User Clicks on Button "aboutTab"
Then User Clicks on Button "saveall"
Given User is on the "MyProfilePage"
Then User Switch frame "postframe"
Then User Clicks on Button "post"
Then User Switch frame "posttextframe"
When User enter into TextBox "textframe" "Hello cucumber"
Then User switchto popup window "share"
Then User Clicks on Button "sharebutton"
Given User is on the "MyProfilePage"
Then User Clicks on Button "file"
Then User Clicks on Button "uploadfromcomputer"
When User enter into TextBox "choosefile" "C:\Users\rajra\Downloads"

Then User Clicks on Button "share"

@test7
Scenario: Settings page testing 7
Then User Clicks on Button "Usermenu"
Then User Clicks on Button "Mysettings"
Given User is on the "Mysettingspage"
Then User Clicks on Button "personal"
Then User Clicks on Button "loginhistory"
Then User Clicks on Button "Display&layout"
Then User Clicks on Button "customizemytabs"
Then User Clicks on Button "customapp"
Then User Select from Dropdown "customapp" "Salesforce Chatter"
Then User Clicks on Button "availabletab"
Then User Clicks on Button "addReports"
Then User Clicks on Button "save"
Then User Clicks on Button "Email"
Then User Clicks on Button "EmailSettings"
When User enter into TextBox "Emailname" "sathyahariram"
When User enter into TextBox "Emailaddress" "sathyahariram@gmail.com"
Then User Clicks on Button "autoBcc"
Then User Clicks on Button "save"
Then User Clicks on Button "calender&reminders"
Then User Clicks on Button "activityReminders"
Then User Clicks on Button "TestReminderButton"
 
 @test9
 Scenario: Drop down is displayed 9
Then User Clicks on Button "Usermenu"

Then validate dropdown is displayed
| My Profile | My Settings | Developer Console | Switch to Lightning Experience | Logout |
    		
 @test8
Scenario: Developer console 8
Then User Clicks on Button "Usermenu"
Then User Clicks on Button "DeveloperConsole"
Then User switchto popup window "Developerpopup"
Then User closes popup "closepopupWindow"




