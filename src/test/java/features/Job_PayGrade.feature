Feature: Job PayGrade verification
Scenario: Validating Job PayGrade verification

Given Verify that user is Job PayGrade page
When User clicks on Add button then user navigates to Add Job Titles page
And User clicks on Cancel button then user navigates to Pay Grade page
And Again click on Add button to navigate to the Add Job Titles page
And User added new Pay Grade and navigated to the Edit Pay Grade page
Then Click on Add button in Add Currency section and assigned Currency to the added pay
And Click on Cancel button in Edit page to navigate Pay Grade page
And Then delete the newly added PayGrade



