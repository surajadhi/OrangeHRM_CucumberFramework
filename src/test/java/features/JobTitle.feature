Feature: Job Title verification

Scenario: Validating Job Title creation

   Given Verify that user is Job Title page
	When User clicked on Add button user navigated to Add Job Title page
	And Added new Job title
	Then Validate the added job title in Job_Titles page
	And Delete the newly added Job Title

