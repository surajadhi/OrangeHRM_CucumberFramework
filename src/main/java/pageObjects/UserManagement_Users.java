package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class UserManagement_Users extends Base{
	
	// static private By tbUsername = By.cssSelector("input#txtUsername");
	static private By linkAdmin=By.linkText("Admin");
	static private By linkUserManagement=By.linkText("User Management");
	static private By linkUsers=By.linkText("Users");
	static private By txtTitle=By.xpath("//h1[contains(text(),'System Users')]");
	static private By tbUsername=By.cssSelector("#searchSystemUser_userName");
	static private By ddUserrole=By.cssSelector("select#searchSystemUser_userType");
	static private By tbEmployeename= By.cssSelector("input#searchSystemUser_employeeName_empName");
	static private By ddStatus=By.id("searchSystemUser_status");
	static private By btnSearch=By.id("searchBtn");
	static private By btnReset=By.id("resetBtn");
	static private By btnAdd=By.id("btnAdd");
	static private By btnDelete=By.id("btnDelete");
	static private By btnDialogDelete=By.id("dialogDeleteBtn");
	static private By checkboxSelect=By.name("chkSelectAll");
	static private By tbResulttable=By.id("resultTable");
	//private static private String i;
	static private By tbRequiredRow=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+i+\"]/td[2]");
	static private By tbSelectCheckbox=By.xpath(".//*[@id='resultTable']/tbody/tr[\"+j+\"]/td[1]/input");
	static private By tbdialogdeletbutton=By.id("dialogDeleteBtn");
	static private By txtNoRecordsFound=By.xpath("//td[contains(text(),'No Records Found')]");
	
	public  WebElement gettbResulttable() {
	    return webElement(tbResulttable);
	}
	
	public  WebElement gettbRequiredRow() {
		return webElement(tbRequiredRow);
	}
	
	
	public  WebElement gettbSelectCheckbox() {
		return webElement(tbSelectCheckbox);
	}
	
	public  WebElement gettbdialogdeletbutton() {
		return webElement(tbdialogdeletbutton);
	}
	
	
	public WebElement getlinkAdmin() {
		return webElement(linkAdmin);
	}
	public WebElement getlinkUserManagement() {
		return webElement(linkUserManagement);
	}
	public WebElement getlinkUsers() {
		return webElement(linkUsers);
	}
	public  WebElement gettxtTitle() {
		return webElement(txtTitle);
	}
	public  WebElement getpagetitle() {
		return webElement(linkUsers);
	}
	
	public  WebElement getTbUsername() {
		return webElement(tbUsername);
	}
	public  WebElement getDdUserrole() {
		return webElement(ddUserrole);
	}
	public  WebElement getTbEmployeename() {
		return webElement(tbEmployeename);
	}
	public  WebElement getDdStatus() {
		return webElement(ddStatus);
	}
	public  WebElement getBtnSearch() {
		return webElement(btnSearch);
	}
	public  WebElement getBtnReset() {
		return webElement(btnReset);
	}
	public  WebElement getBtnAdd() {
		return webElement(btnAdd);
	}
	public  WebElement getBtnDelete() {
		return webElement(btnDelete);
	}
	
	public  WebElement getBtnDialogDelete() {
		return webElement(btnDialogDelete);
	}
	public  WebElement getCheckboxSelect() {
		return webElement(checkboxSelect);
	}
	public  WebElement gettxtNoRecordsFound() {
		return webElement(txtNoRecordsFound);
	}

}
