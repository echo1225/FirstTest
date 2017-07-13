@regression 
Feature: Login feature 

@regression-1 
Scenario: Verify Invalid Login 
	Given I open the default browser 
	And I am on home page 
	When I enter mohammad@technosoftacademy.io into username text fields on home screen 
	And I enter test1234 into password text fields on home screen 
	And I click on login button on home screen 
	Then I verify that i am an invalid login page 
	And I close the default browser 
	
@regression-2 
Scenario: Verify Invalid Login two 
	Given I open the default browser 
	Given I am on home page 
	When I enter mohammad@technosoftacademy.io into username text fields on home screen 
	And I enter test1234 into password text fields on home screen 
	And I click on login button on home screen 
	Then I verify that i am an invalid login page 
	And I close the default browser 
    