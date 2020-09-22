package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Job_3_EditPayGrades {
	static private Base  b=new Base();
	static private By headertxtEditPayGrid=By.id("payGradeHeading");
	static private By txtBoxName=By.id("payGrade_name");
	static private By btnEdit=By.id("btnSave");
	static private By btnCancel=By.id("btnCancel");
	static private By btnAdd=By.id("btnAddCurrency");
	static private By txtBoxCurrency=By.id("payGradeCurrency_currencyName");
	static private By txtBoxMinimumSalary=By.id("payGradeCurrency_minSalary");
	static private By txtBoxMaximumSalary=By.id("payGradeCurrency_maxSalary");
	static private By btnSaveCurrency=By.id("btnSaveCurrency");
	static private By btnCancelCurrency= By.id("cancelButton");
	static private By tbRequiredRow=By.xpath(".//*[@id='tblCurrencies']/tbody/tr[\"+(i)+\"]/td[2]");
	static private By tbSelectCheckbox=By.xpath(".//*[@id='tblCurrencies']/tbody/tr[\"+(j)+\"]/td[1]/input");

	public WebElement getHeadertxtEditPayGrid() {
		return b.webElement(headertxtEditPayGrid);
	}
	public WebElement getTxtBoxName() {
		return b.webElement(txtBoxName);
	}
	public WebElement getBtnEdit() {
		return b.webElement(btnEdit);
	}
	public WebElement getBtnCancel() {
		return b.webElement(btnCancel);
	}
	public WebElement getBtnAdd() {
		return b.webElement(btnAdd);
	}
	public WebElement getTxtBoxCurrency() {
		return b.webElement(txtBoxCurrency);
	}
	public WebElement getTxtBoxMinimumSalary() {
		return b.webElement(txtBoxMinimumSalary);
	}
	public WebElement getTxtBoxMaximumSalary() {
		return b.webElement(txtBoxMaximumSalary);
	}
	
	public WebElement getBtnSaveCurrency() {
		return b.webElement(btnSaveCurrency);
	}
	public WebElement getBtnCancelCurrency() {
		return b.webElement(btnCancelCurrency);
	}
	public WebElement getTbRequiredRow() {
		return b.webElement(tbRequiredRow);
	}
	public WebElement getTbSelectCheckbox() {
		return b.webElement(tbSelectCheckbox);
	}
	 


}
