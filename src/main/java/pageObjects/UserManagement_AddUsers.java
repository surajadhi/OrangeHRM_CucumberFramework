package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class UserManagement_AddUsers extends Base {

	static private By txtTitle=By.cssSelector("#UserHeading");
	static private By ddUserrole=By.cssSelector("select#systemUser_userType");
	static private By tbEmployeeName=By.cssSelector("input#systemUser_employeeName_empName");
	static private By tbUsername=By.cssSelector("input#systemUser_userName");
	static private By ddStatus=By.cssSelector("select#systemUser_status");
	static private By tbPassword=By.id("systemUser_password");
	static private By tbConfirmPassword=By.id("systemUser_confirmPassword");
	static private By btnSave=By.id("btnSave");
	static private By btnCancel=By.id("btnCancel");
	
	public WebElement gettxtTitle() {
		return webElement(txtTitle);
	}
	
	public WebElement getDdUserrole() {
		return webElement(ddUserrole);
	}
	public WebElement getTbEmployeeName() {
		return webElement(tbEmployeeName);
	}
	public WebElement getTbUsername() {
		return webElement(tbUsername);
	}
	public WebElement getDdStatus() {
		return webElement(ddStatus);
	}
	public WebElement getTbPassword() {
		return webElement(tbPassword);
	}
	public WebElement getTbConfirmPassword() {
		return webElement(tbConfirmPassword);
	}
	public WebElement getBtnSave() {
		return webElement(btnSave);
	}
	public WebElement getBtnCancel() {
		return webElement(btnCancel);
	}
	
}
