Feature:Test Register function

Scenario:Register with valid input
Given user open chrome browser
And navigates to newtours
When user clicks on Register link
And user enter username
And user enter password
And user enter confirmpassword
Then click on Register button
And verify register success
And close the browser
  