package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Job_JobCategories {
	
	static private Base  b=new Base();
	static private By linkAdmin=By.linkText("Admin");
    static private By linkJob=By.linkText("Job");
     static private By linkJobCategories=By.linkText("Job Categories");
	 static private By headerJobCategories=By.xpath("//h1[contains(text(),'Job Categories')]");
	 static private By btnAdd=By.id("btnAdd");
	 static private By btnSave=By.id("btnSave");
	 static private By btnDelete=By.id("btnDelete");
	 static private By txtbox=By.id("jobCategory_name");
	 static private By tbResulttable=By.id("resultTable");
	 static private By tbRequiredRow=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+(i)+\"]/td[2]");
	 static private By tbSelectCheckbox=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+(j)+\"]/td[1]/input");
	 static private By tbdialogdeletbutton=By.id("dialogDeleteBtn");
	
	 

	public WebElement getLinkAdmin() {
		return b.webElement(linkAdmin);
	}
	public WebElement getLinkJob() {
		return b.webElement(linkJob);
	}
	public WebElement getLinkJobCategories() {
		return b.webElement(linkJobCategories);
	}
	public WebElement getheaderJobCategories() {
		return b.webElement(headerJobCategories);
	}
	public WebElement getBtnAdd() {
		return b.webElement(btnAdd);
	}
	public WebElement getBtnDelete() {
		return b.webElement(btnDelete);
	}
	public WebElement getBtnSave() {
		return  b.webElement(btnSave);
	}
	public WebElement getTxtbox() {
		return b.webElement(txtbox);
	}
	public WebElement getTbResulttable() {
		return b.webElement(tbResulttable);
	}
	public WebElement getTbRequiredRow() {
		return b.webElement(tbRequiredRow);
	}
	public WebElement getTbSelectCheckbox() {
		return b.webElement(tbSelectCheckbox);
	}
	public WebElement getTbdialogdeletbutton() {
		return b.webElement(tbdialogdeletbutton);
	}
	 
	 

}
