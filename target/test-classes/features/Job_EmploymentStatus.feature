Feature: Job EmploymentStatus verification
Scenario: Validating  Job EmploymentStatus verification

Given Login to app and navigate to EmploymentStatus page
When User clicks on Add button then section header is changed 
And User clicks on delete buttonn then section header is changed to Employmentstatus
Then Again click on Add button and add a new Employment status
And Validate that record is added in the Employment status grid
And Delete the record and logout from all