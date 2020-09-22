

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Job_2_AddPayGrades {
	static private Base  b=new Base();
	static private By headerTxtAddPayGrade= By.id("payGradeHeading");
	static private By txtBoxName=By.id("payGrade_name");
	static private By btnSave=By.id("btnSave");
	static private By btnCancel=By.id("btnCancel");


	
	public WebElement getHeaderTxtAddPayGrade() {
		return  b.webElement(headerTxtAddPayGrade);
	}
	public WebElement getTxtBoxName() {
		return  b.webElement(txtBoxName);
	}
	public WebElement getBtnSave() {
		return  b.webElement(btnSave);
	}
	public WebElement getBtnCancel() {
		return  b.webElement(btnCancel);
	}
	
	
	

}
