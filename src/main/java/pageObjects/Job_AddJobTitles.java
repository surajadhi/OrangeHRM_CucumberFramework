package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Job_AddJobTitles {
	
	static private Base  b=new Base();
	static private By pg_Title=By.id("saveHobTitleHeading");
	static private By txtbx_JobTitle=By.id("jobTitle_jobTitle");
	static private By txtbx_JobDescription=By.id("jobTitle_jobDescription");
	static private By selectFile_JobSpecification=By.id("jobTitle_jobSpec");
	static private By notetxtbox_Note=By.id("jobTitle_note");
	static private By btn_Save=By.id("btnSave");
	static private By btn_Cancel=By.id("btnCancel");

	

	public WebElement getPg_Title() {
		return b.webElement(pg_Title);
	}
	public WebElement getTxtbx_JobTitle() {
		return b.webElement(txtbx_JobTitle);
	}
	public WebElement getTxtbx_JobDescription() {
		return b.webElement(txtbx_JobDescription);
	}
	public WebElement getSelectFile_JobSpecification() {
		return b.webElement(selectFile_JobSpecification);
	}
	public WebElement getNotetxtbox_Note() {
		return b.webElement(notetxtbox_Note);
	}
	public WebElement getBtn_Save() {
		return b.webElement(btn_Save);
	}
	public WebElement getBtn_Cancel() {
		return b.webElement(btn_Cancel);
	}
	

}
