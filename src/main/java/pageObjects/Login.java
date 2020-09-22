package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Login extends Base{
	
	
  
    static private By tbUsername = By.cssSelector("input#txtUsername");
	static private By tbPassword = By.id("txtPassword");
	static private By btnName = By.id("btnLogin");
	
	public void navigatetourl() throws IOException
    {
		initializeDriver() ;
     	driver.get(prop.getProperty("URL"));
	}

	public WebElement getTbUsername() {
		return webElement(tbUsername);
	}

	public WebElement getTbPassword() {

		return webElement(tbPassword);
	}

	public WebElement getBtnName() {
		// clickWhenReady(btnName, 10);
		return webElement(btnName);
	}

}
