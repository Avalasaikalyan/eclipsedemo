
  Feature: Test Login Functionality
  
  Scenario: Login with valid data/inputs
    Given user open chrome browser
    And navigates to newtours
    When user enters valid username
    And user enters valid password
    And user clicks on submit
    Then verify login success
    And close the browser

  
