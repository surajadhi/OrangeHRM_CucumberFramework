package stepDefinations;

import cucumber.api.java.en.*;
import pageObjects.Dashboard;
import pageObjects.Job_AddJobTitles;
import pageObjects.Job_JobTitles;
import resources.Base;
import resources.Log;

public class StepDefination_2_JobTitles {
	    int i;

	static Base b=new Base();
	 
	 static Job_JobTitles Job_JobTitles= new Job_JobTitles();
	 static Job_AddJobTitles Job_AddJobTitles =new Job_AddJobTitles();
	 static Dashboard Db=new Dashboard();
	 static Log log=new Log();
	  
	@Given("^Verify that user is Job Title page$")
    public void verify_that_user_is_job_title_page() throws Throwable {
		log.startTestCase("Job Title");
         b.login();
		 b.clickWebElement(Job_JobTitles.getlinkAdmin(),"Admin menu");
		 b.clickWebElement(Job_JobTitles.getlinkJob(),"Job submenu");
		 b.clickWebElement(Job_JobTitles.getlinkJobTitles(),"Job Titles submenu");	
		 b.verifyTitleActtoExp(Job_JobTitles.getpgTitle(),"Job Titles");	 
    }

    @When("^User clicked on Add button user navigated to Add Job Title page$")
    public void user_clicked_on_add_button_user_navigated_to_add_job_title_page() throws Throwable {
        b.clickWebElement(Job_JobTitles.getBtnAdd(), "Add Button");
    }

    @Then("^Validate the added job title in Job_Titles page$")
    public void validate_the_added_job_title_in_jobtitles_page() throws Throwable {
      //  b.verifyTitleActtoExp(Job_AddJobTitles.getPg_Title(),"Add Job Title");
    }

    @And("^Added new Job title$")
    public void added_new_job_title() throws Throwable {
        b.enteredText(Job_AddJobTitles.getTxtbx_JobTitle(),"Job Title", Base.prop.getProperty("Job_Title"));
        b.enteredText(Job_AddJobTitles.getTxtbx_JobDescription(), "Job Description", Base.prop.getProperty("Job_Description"));
        b.browseButtonToOpenMyComputerWindow(Job_AddJobTitles.getSelectFile_JobSpecification());
        b.enteredText(Job_AddJobTitles.getNotetxtbox_Note(), "Note",  Base.prop.getProperty("Note"));
        b.clickWebElement(Job_AddJobTitles.getBtn_Save(), "Save button");
    }
    
    @And("^Delete the newly added Job Title$")
    public void delete_the_newly_added_job_title() throws Throwable {
    	 	
    	 b.verifyTitleActtoExp(Job_JobTitles.getpgTitle(),"Job Titles");	
    	 b.webtableclass(Job_JobTitles.gettbResulttable(),Base.prop.getProperty("Job_Title"));
    	 b.clickWebElement(Job_JobTitles.getBtnDelete(), "Delete Button");
    	 b.clickWebElement(Job_JobTitles.getTbdialogdeletbutton(), "Delete Dialog Button");  	 
    	 b.logout();
    	
    	 log.endTestCase("Job Titles");
    }

   
}
