package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import resources.Base;

public class Job_1_PayGrades {
	static Base  b=new Base();
	static By linkAdmin=By.linkText("Admin");
	 
	/* @FindBy(linkText="Admin")
	 WebElement linkAdmin;*/
	 static private By linkJob=By.linkText("Job");
	 static private By linkJobPayGrades=By.linkText("Pay Grades");
	 static private By headertxtPayGrades=By.xpath("//h1[contains(text(),'Pay Grades')]");
	 static private By btnAdd=By.id("btnAdd");
	 static private By btnDelete=By.id("btnDelete");
	 static private By tbResulttable=By.id("resultTable");
	 static private By tbdialogdeletbutton=By.id("dialogDeleteBtn");
	 
	public WebElement getLinkAdmin() {
		return b.webElement(linkAdmin);
	}
	public WebElement getLinkJob() {
		return b.webElement( linkJob);
	}
	public WebElement getLinkJobPayGrades() {
		return b.webElement( linkJobPayGrades);
	}
	public WebElement getHeadertxtPayGrades() {
		return b.webElement( headertxtPayGrades);
	}
	public WebElement getBtnAdd() {
		return b.webElement( btnAdd);
	}
	public WebElement getBtnDelete() {
		return b.webElement( btnDelete);
	}
	public WebElement getTbResulttable() {
		return b.webElement( tbResulttable);
	}
	
	public WebElement getTbdialogdeletbutton() {
		return b.webElement( tbdialogdeletbutton);
	}
	 
	 
}
