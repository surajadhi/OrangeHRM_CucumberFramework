Feature: User Management page verification

Scenario: User Management page verification
  When User in Users page
  Then Click on Add Users button
  And  Create New user in Add User page
  
 
 Scenario: Verify created user is deleted from the User page
  When Created User is present in the Users page  
  Then Search the created user and then reset it
  And Again search the created user and then delete it
 And Search whether created user is deleted or not and the logout