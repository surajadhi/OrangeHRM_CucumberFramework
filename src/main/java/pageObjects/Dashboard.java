package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Dashboard extends Base{

	static By pghrText= By.xpath("//h1[contains(text(),'Dashboard')]");
    static By welcomeAdminLink=By.id("welcome");
    static By logoutLink=By.xpath("//a[contains(text(),'Logout')]");

	public WebElement getPghrText() {
		return webElement(pghrText);
	}


	public WebElement getwelcomeAdminLink() {
		return webElement(welcomeAdminLink);
	}


	public WebElement getlogoutLink() {
		return webElement(logoutLink);
	}
	
	
}
