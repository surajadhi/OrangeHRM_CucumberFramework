package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import pageObjects.*;
import resources.Base;
import resources.Log;




public class StepDefination_5_Job_JobCategories {
	static Base b=new Base();
	static Job_JobCategories  Job_JobCategories=new Job_JobCategories();
	static Log log=new Log();
 

	    @Given("^User is logged in and navigated to the Job Category page$")
	    public void user_is_logged_in_and_navigated_to_the_job_category_page() throws Throwable {
	     log.startTestCase("Job Category");
	   	 b.login();
		 b.clickWebElement(Job_JobCategories.getLinkAdmin(),"Admin menu");
		 b.clickWebElement(Job_JobCategories.getLinkJob(),"Job submenu");
		 b.clickWebElement(Job_JobCategories.getLinkJobCategories(), "Job Categories Menu");
		 b.verifyTitleActtoExp(Job_JobCategories.getheaderJobCategories(), "Job Categories");
	    }

	    @When("^Click on Add button then user added new Job Category$")
	    public void click_on_add_button_then_user_added_new_job_category() throws Throwable {
	    	 b.clickWebElement(Job_JobCategories.getBtnAdd(),"Add Button Clicked");
	    	 b.enteredText(Job_JobCategories.getTxtbox(), "Job Category Name", Base.prop.getProperty("Job_Category_Name"));
	    	 b.clickWebElement(Job_JobCategories.getBtnSave(), "Save Button");
	    	 
	    }

	    @Then("^validated that Job Category is add and then delete it successfully$")
	    public void validated_that_job_category_is_add_and_then_delete_it_successfully() throws Throwable {
	    	 b.webtableclass(Job_JobCategories.getTbResulttable(),Base.prop.getProperty("Job_Category_Name"));
	    	 b.clickWebElement(Job_JobCategories.getBtnDelete(), "Delete Button");
	    	 b.clickWebElement(Job_JobCategories.getTbdialogdeletbutton(), "Delete Dialog Button"); 
	    	 b.logout();
	    	 log.endTestCase("Job Category");
	    }


}
