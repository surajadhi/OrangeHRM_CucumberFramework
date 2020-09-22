package stepDefinations;


import cucumber.api.java.en.When;
import pageObjects.Dashboard;
import pageObjects.UserManagement_AddUsers;
import pageObjects.UserManagement_Users;
import resources.Base;
import resources.Log;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class StepDefination_1_Users  {
	 static UserManagement_Users UM_Users =new UserManagement_Users();
	 static UserManagement_AddUsers UM_AddUsers= new UserManagement_AddUsers();
	 
	 static Base b=new Base();
	 static Dashboard Db=new Dashboard();
	 static Log log=new Log();
	
	 
	 @When("^User in Users page$")
	    public void user_in_users_page() throws Throwable {	 
		
		 log.startTestCase("Users");
		 b.login();
		 b.clickWebElement(UM_Users.getlinkAdmin(),"Admin menu");
		 b.clickWebElement(UM_Users.getlinkUserManagement(),"User Management submenu");
		 b.clickWebElement(UM_Users.getlinkUsers(),"Users submenu");	
		 b.verifyTitleActtoExp(UM_Users.gettxtTitle(), "System Users");	 
	    }

	    @Then("^Click on Add Users button$")
	    public void click_on_add_users_button() throws Throwable {
	     b.clickWebElement(UM_Users.getBtnAdd(), "Add Button");
	    }
	    
	    @Then("^Create New user in Add User page$")
	    public void create_New_user_in_Add_User_page() throws Throwable {
	     b.verifyTitleActtoExp(UM_AddUsers.gettxtTitle(),"Add User");
	     b.selectdropdownvalue(UM_AddUsers.getDdUserrole(),"selectByVisibleText",Base.prop.getProperty("UserRole"));
	     b.enteredText(UM_AddUsers.getTbEmployeeName(),"Employee Name",Base.prop.getProperty("EmployeeName"));
	     b.enteredText(UM_AddUsers.getTbUsername(),"Username",Base.prop.getProperty("Username_User"));
	     b.selectdropdownvalue(UM_AddUsers.getDdStatus(),"selectByVisibleText",Base.prop.getProperty("Status"));
	     b.enteredText(UM_AddUsers.getTbPassword(),"Password",Base.prop.getProperty("UserPassword"));
	     b.enteredText(UM_AddUsers.getTbConfirmPassword(),"Confirm Password",Base.prop.getProperty("UserConfirmPassword"));
	     b.clickWebElement(UM_AddUsers.getBtnSave(),"Save Buton");
	     b.verifyTitleActtoExp(UM_AddUsers.gettxtTitle(),"Add User");
	    }

	    @When("^Created User is present in the Users page$")
	    public void created_User_is_present_in_the_Users_page() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	search();
	      b.webtableclass(UM_Users.gettbResulttable(), Base.prop.getProperty("EmployeeName"));
	    }

	

	    @Then("^Search the created user and then reset it$")
	    public void search_the_created_user_and_then_reset_it() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	      b.clickWebElement(UM_Users.getBtnReset(), "Reset Button");
	      
	    }

	    @And("^Again search the created user and then delete it$")
	    public void again_search_the_created_user_and_then_delete_it() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	search();
		   b.webtableclass(UM_Users.gettbResulttable(), Base.prop.getProperty("EmployeeName"));
	       b.deletebuttonClick(UM_Users.getBtnDelete(), "Delete Button");
	       b.dialogbuttonClick(UM_Users.getBtnDialogDelete(), "Dialog Delete Button");
	       search();
	       b.noRecordsInGrid(UM_Users.gettxtNoRecordsFound());
	       
	      
	    }
	    
	    @And("^Search whether created user is deleted or not and the logout$")
	    public void search() {
	    	b.enteredText(UM_Users.getTbUsername(), "Username",Base.prop.getProperty("Username_User"));
			b.enteredText(UM_Users.getDdUserrole(), "selectByVisibleText",Base.prop.getProperty("UserRole"));
			b.enteredText(UM_Users.getTbEmployeename(),"Employee Name",Base.prop.getProperty("EmployeeName"));
			b.enteredText(UM_Users.getDdStatus(),"selectByVisibleText",Base.prop.getProperty("Status"));
			b.clickWebElement(UM_Users.getBtnSearch(),"Search Button");
			b.logout();
			log.endTestCase("Users");
	    }

}
