package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;



public class Job_EmploymentStatus {
	 
	 WebDriver driver;
	 static  private Base b=new Base();
	
	 @FindBy(linkText="Admin")
	 WebElement linkAdmin;
	 
	
	 @FindBy(linkText="Job")
	 WebElement linkJob;
	 
	 @FindBy(linkText="Employment Status")
	 WebElement EmploymentStatus;
	 
	 @FindBy(xpath="//div[@id='search-results']//h1[contains(text(),'Employment Status')]")
	 WebElement HeaderTxtEmploymentStatus;
	 
	 @FindBy(id="btnAdd")
	 WebElement btnAdd;
	 
	 @FindBy(id="btnDelete")
	 WebElement btnDelete;
	 
	 @FindBy(css="#empStatusHeading")
	 WebElement HeaderTxtAddEmploymentStatus;
	 
	 @FindBy(id="empStatus_name")
	 WebElement txtBoxName;
	 
	 @FindBy(id="btnSave")
	 WebElement btnSave;
	 
	 @FindBy(id="btnCancel")
	 WebElement btnCancel;
	 
	 @FindBy(id="resultTable")
	 WebElement tbResulttable;
	 
	 @FindBy(xpath=".//*[@id='resultTable']/tbody/tr[\"+(i)+\"]/td[2]")
	 WebElement tbRequiredRow;
	 
	 @FindBy(xpath=".//*[@id='resultTable']/tbody/tr[\"+(j)+\"]/td[1]/input")
	 WebElement tbSelectCheckbox;
	 
	 @FindBy(id="dialogDeleteBtn")
	 WebElement tbdialogdeletbutton;

	 public Job_EmploymentStatus(WebDriver driver){

         this.driver= driver;

        PageFactory.initElements(driver, this);

    }  

	

	public WebElement getLinkAdmin() {
		return linkAdmin;
	}

	public WebElement getLinkJob() {
		return linkJob;
	}

	public WebElement getEmploymentStatus() {
		return EmploymentStatus;
	}

	public WebElement getHeaderTxtEmploymentStatus() {
		return HeaderTxtEmploymentStatus;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getHeaderTxtAddEmploymentStatus() {
		return HeaderTxtAddEmploymentStatus;
	}

	public WebElement getTxtBoxName() {
		return txtBoxName;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTbResulttable() {
		return tbResulttable;
	}

	public WebElement getTbRequiredRow() {
		return tbRequiredRow;
	}

	public WebElement getTbSelectCheckbox() {
		return tbSelectCheckbox;
	}

	public WebElement getTbdialogdeletbutton() {
		return tbdialogdeletbutton;
	}

	

	 
	 
	 


	

	
	 
	 
	 
	 

}
