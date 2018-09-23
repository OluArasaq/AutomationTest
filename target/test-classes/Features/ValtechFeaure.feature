@Valtech
Feature: ValtechFeature
	
	
	Scenario: Recent blogs section 
	Given that a user is on valtech website 
	Then user should see recent blogs correctly 


Scenario: Check About Service and Work
Given that a user is on valtech website 
When a user navigate to about service and work
Then the user should see the page correctly 

Scenario: Verify the total number of offices
	Given Customer is on Valtech website
	When  Navigates to contact section to count the number of offices
	Then Number of offices should be 36