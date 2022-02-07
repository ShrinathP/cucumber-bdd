Feature: Login Page Feature

  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login - My Store"

  Scenario: Forgot Password link
    Given user is on login page
    Then forgot password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "naveenanimation20@gmail.com"
    And user enters password "Selenium12345"
    And user clicks on Login Button
    Then user gets the title of the page
    And page title should be "My Account - My Store"