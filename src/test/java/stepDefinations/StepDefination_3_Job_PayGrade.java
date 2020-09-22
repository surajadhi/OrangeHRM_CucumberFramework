package stepDefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.*;
import resources.Base;
import resources.Log;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination_3_Job_PayGrade {
	
	 static Base b=new Base();
	 static Job_1_PayGrades Job_1_PayGrades =new Job_1_PayGrades();
	 static Job_2_AddPayGrades Job_2_AddPayGrades=new Job_2_AddPayGrades();
	 static Job_3_EditPayGrades Job_3_EditPayGrades=new Job_3_EditPayGrades();
	 static Log log=new Log();
	 
	 
	@Given("^Verify that user is Job PayGrade page$")
    public void verify_that_user_is_job_paygrade_page() throws Throwable {
		log.startTestCase("Pay Grade");
		  b.login();
			 b.clickWebElement(Job_1_PayGrades.getLinkAdmin(),"Admin menu");
			 b.clickWebElement(Job_1_PayGrades.getLinkJob(),"Job submenu");
			 b.clickWebElement(Job_1_PayGrades.getLinkJobPayGrades(),"Pay Grades");	
			 b.verifyTitleActtoExp(Job_1_PayGrades.getHeadertxtPayGrades(), "Pay Grades");
    }

    @When("^User clicks on Add button then user navigates to Add Job Titles page$")
    public void user_clicks_on_add_button_then_user_navigates_to_add_job_titles_page() throws Throwable {
    	b.clickWebElement(Job_1_PayGrades.getBtnAdd(), "Add Button");
    	b.verifyTitleActtoExp(Job_2_AddPayGrades.getHeaderTxtAddPayGrade(), "Add Pay Grade");
    	b.enteredText(Job_2_AddPayGrades.getTxtBoxName(), "Name Text field", Base.prop.getProperty("PayGrade_Name"));
        
    }
    

    @And("^User clicks on Cancel button then user navigates to Pay Grade page$")
    public void user_clicks_on_cancel_button_then_user_navigates_to_pay_grade_page() throws Throwable {
       b.clickWebElement(Job_2_AddPayGrades.getBtnCancel(), "Cancel Button");
    }
    
    @And("^Again click on Add button to navigate to the Add Job Titles page$")
    public void again_click_on_add_button_to_navigate_to_the_add_job_titles_page() throws Throwable {
    	b.clickWebElement(Job_1_PayGrades.getBtnAdd(), "Add Button");
    	b.verifyTitleActtoExp(Job_2_AddPayGrades.getHeaderTxtAddPayGrade(), "Add Pay Grade");
    	b.enteredText(Job_2_AddPayGrades.getTxtBoxName(), "Name Text field", Base.prop.getProperty("PayGrade_Name"));
    	
    }
    @And("^User added new Pay Grade and navigated to the Edit Pay Grade page$")
    public void user_added_new_pay_grade_and_navigated_to_the_edit_pay_grade_page() throws Throwable {
    	b.clickWebElement(Job_2_AddPayGrades.getBtnSave(), "Save Button");
    	b.verifyTitleActtoExp(Job_3_EditPayGrades.getHeadertxtEditPayGrid(), "Edit Pay Grade");
    }
    
    @Then("^Click on Cancel button in Edit page to navigate Pay Grade page$")
    public void click_on_Cancel_button_in_Edit_page_to_navigate_Pay_Grade_page() throws Throwable {
        b.clickWebElement(Job_2_AddPayGrades.getBtnCancel(), "Cancel Button");
        b.verifyTitleActtoExp(Job_1_PayGrades.getHeadertxtPayGrades(), "Pay Grades");
       b.webtableclass(Job_1_PayGrades.getTbResulttable(),Base.prop.getProperty("PayGrade_Name"));
        
    }
    @Then("^Click on Add button in Add Currency section and assigned Currency to the added pay$")
    public void click_on_add_button_in_add_currency_section_and_assigned_currency_to_the_added_pay() throws Throwable {
    	
    	
    	b.clickWebElement(Job_3_EditPayGrades.getBtnAdd(), "Add Currency Button");
    	b.enteredText(Job_3_EditPayGrades.getTxtBoxCurrency(), "Currency Field", Base.prop.getProperty("Currency"));
    	b.enteredText(Job_3_EditPayGrades.getTxtBoxMinimumSalary(), "Minimum Salary", Base.prop.getProperty("Min_Salary"));
    	b.enteredText(Job_3_EditPayGrades.getTxtBoxMaximumSalary(), "Maximum Salary", Base.prop.getProperty("Max_Salary"));
    	b.clickWebElement(Job_3_EditPayGrades.getBtnSaveCurrency(),"Save Currency Button");
    	//b.clickWebElement(Job_3_EditPayGrades.getBtnCancel(),"Save Cancel Button");
    }
  

  
    @And("^Then delete the newly added PayGrade$")
    public void then_delete_the_newly_added_paygrade() throws Throwable {
    	 b.verifyTitleActtoExp(Job_1_PayGrades.getHeadertxtPayGrades(), "Pay Grades");
    	 b.webtableclass(Job_1_PayGrades.getTbResulttable(),Base.prop.getProperty("PayGrade_Name"));
    	 b.clickWebElement(Job_1_PayGrades.getBtnDelete(), "Delete Button");
    	 b.clickWebElement(Job_1_PayGrades.getTbdialogdeletbutton(), "Delete Dialog Button"); 
    	 b.logout();
    	 log.endTestCase("Pay grade");
    }
}
