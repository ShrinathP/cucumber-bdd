Feature: Login Action
  Background:
    Given User is on Google home page
    And the user has accessed the website
    And the shopping page is loaded

#Scenario: Successful Login with Valid Credentials
# Given User is on Home Page
# When User Navigate to LogIn Page
# # Data driven testing without Example
# When User enters "usermane" and "password"
# #When User enters "ShriUsername" and "ShriPassword"
# Then Message displayed Login Successfully

  @FirstTag @FunctionalTests
  Scenario Outline: This is the 2nd scenario
    Given User is on Home Page
    When I enter Username as "<username>" and Password as "<password>"
    Examples:
      |username|password|
      |first_username|first_password|
      |second_username|second_password|


 #@SecondTag
  Scenario Outline: Successful LogOut
    Given User is on Home Page
    When I enter Username as "<surname>" and Password as "<password>"
    And user types these multiple keystrokes
      |01|02|03|
      |11|12|13|
      |31|32|33|

    And user types these multiple keystrokes with title datatable
      | First Name | Last Name | Phone No   | Password | DOB Day  | DOB Month  | DOB Year  | Gender 	|
      | Abc FN 	 | Abc LN 	 | 0123123123 | Pass1234 | 01 		| Jan 		 | 1990 	 | Male   	|
      | Def FN 	 | Def LN 	 | 0456456456 | Abcd1234 | 01 		| Feb 		 | 1990 	 | Female   |
      | Xyz FN 	 | Xyz LN 	 | 0789789789 | Pass2018 | 01 		| Mar 		 | 1990 	 | Female   |

    And user types these multiple keystrokes with title datatable2
      |            | Longitude   | Password | DOB Day  | DOB Month  | DOB Year  | Gender 	|
      | Lufthansa  | 0123123123 | Pass1234 | 01 		| Jan 		 | 1990 	 | Male   	|
      | Quatar 	 | 0456456456 | Abcd1234 | 01 		| Feb 		 | 1990 	 | Female   |
      | Air India  | 0789789789 | Pass2018 | 01 		| Mar 		 | 1990 	 | Female   |
    When User LogOut from the Application
    Then Message displayed LogOut Successfully
    And User enters Credentials to LogIn
      | Username   | Password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@154 |

   #USE TABLE ENTRY TRANSFORMER WITH ENTRY VALUES HERE -(WITH HEADERS)
    And User enters Geolocation to LogIn
      |      |       lat |         lon |
      | KMSY | 29.993333 |  -90.258056 |
      | KSFO | 37.618889 | -122.375000 |
      | KSEA | 47.448889 | -122.309444 |
      | KJFK | 40.639722 |  -73.778889 |
#USE TABLE ROW TRANSFORMER WITH LIST VALUE HERE -(WITHOUT HEADERS)
    And User enters Geolocation to LogIn2
      | KMSY | 29.993333 |  -90.258056 |
      | KSFO | 37.618889 | -122.375000 |
      | KSEA | 47.448889 | -122.309444 |
      | KJFK | 40.639722 |  -73.778889 |
    Examples:
      | surname   | password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@153 |