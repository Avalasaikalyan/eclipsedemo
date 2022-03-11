Feature: Tesg login with different set of input

  Scenario Outline: Test Login with valid & invalid set of input
    * user open chrome browser
    * navigates to newtours
    * enter username as "<username>"
    * enter password as "<password>"
    * user clicks on submit
    * verify login success
    * close the browser

    Examples: 
      | username | password  |
      | mercury  | mercury   |
      | saranya  | shanmugam |
      | m        | mercury   |
