package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Job_JobTitles {



	
	static private Base  b=new Base();
	static private By linkAdmin=By.linkText("Admin");
	static private By linkJob=By.linkText("Job");
	static private By linkJobTitles=By.linkText("Job Titles");
	static private By pgTitle=By.xpath("//h1[contains(text(),'Job Titles')]");
	static private By btnAdd=By.id("btnAdd");
	static private By btnDelete=By.id("btnDelete");
	static private By tbResulttable=By.xpath(".//*[@id='resultTable']/tbody");

	static private By tbdialogdeletbutton=By.id("dialogDeleteBtn");
	
	public WebElement getlinkAdmin() {
		return b.webElement(linkAdmin);
	}

	public WebElement getlinkJob() {
		return b.webElement(linkJob);
	}

	public WebElement getlinkJobTitles() {
		return b.webElement(linkJobTitles);
	}
	
	public WebElement getpgTitle() {
		return b.webElement(pgTitle);
	}

	public WebElement getBtnAdd() {
		return b.webElement(btnAdd);
	}

	public WebElement getBtnDelete() {
		return b.webElement(btnDelete);
	}

	public WebElement gettbResulttable() {
		return b.webElement(tbResulttable);
	}



	public WebElement getTbdialogdeletbutton() {
		return b.webElement(tbdialogdeletbutton);
	}

	




	
    
	

}
