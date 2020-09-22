package resources;
import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Dashboard;
import pageObjects.Login;


public class Base extends Log {
	

	public static WebDriver driver;
	public static Properties prop = new Properties();
	/**
	 * This method is used to 
	 * @param 
	 * @param 
	 * @throws Exception
	 */	
	
	public  void readSendKeysData() throws IOException{
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.Properties"); 
		FileInputStream fileInput = new FileInputStream(file);
		prop.load(fileInput);
		
	
	}
	
	
public  WebDriver initializeDriver() throws IOException {
	readSendKeysData(); 
	String browsername=prop.getProperty("browser");
	System.out.println(browsername);
	
	if (browsername.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromePath"));
		ChromeOptions options =new ChromeOptions();
		options.addArguments("headless");
		
		 driver = new ChromeDriver();
		
	}else if (browsername.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",prop.getProperty("FireFoxPath"));
		 driver = new FirefoxDriver();
	}else if (browsername.equals("IE")) {
		
		System.setProperty("webdriver.IE.driver",prop.getProperty("IEPath"));
		 driver = new InternetExplorerDriver();
	}else if (browsername.isEmpty()) {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromePath"));
		 driver = new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
}
/**
 * This method is used to enter the URL
 * 
 * @param result
 * @throws IOException 
 * @throws Exception
 */
public void openUrl() throws IOException {
	initializeDriver() ;
 	driver.get(prop.getProperty("URL"));
}

/**
 * This method is used to Login to the application
 * 
 * @param result
 * @throws IOException 
 * @throws Exception
 */
public void login() throws IOException  {
	Login lg=new Login();
	Dashboard Db=new Dashboard();

	lg.navigatetourl(); 
	enteredText(lg.getTbUsername(),"Admin Field",Base.prop.getProperty("Username"));//b.prop.getProperty("Username")
 	enteredText(lg.getTbPassword(),"Password Field",Base.prop.getProperty("Password"));//
 	clickWebElement(lg.getBtnName(),"Login Button");
 	verifyTitleActtoExp(Db.getPghrText(),"Dashboard");
}

/**
 * This method is used to Logout to the application
 * 
 * @param result
 * @throws Exception
 */

public void logout() {
	Dashboard Db=new Dashboard();
	clickWebElement(Db.getwelcomeAdminLink(), "Welcome Admin Link");
	clickWebElement(Db.getlogoutLink(), "Logout");
	driver.close();
}


/**
 * This method is used to take screenshot
 * 
 * @param result
 * @throws Exception
 */
	public void getScreenshot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(prop.getProperty("ScreenshotPath")+result + timestamp()+"Screenshot.png"));
	}
	
	public static String timestamp() {
       return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
}
	/**
	 * Common method for all the locator
	 * @param webElement
	 * @throws Exception
	 */	
	public  WebElement webElement(By webElement){
		
			return driver.findElement(webElement);
	}
	
	
	/**
	 * This method is used to verify the whether field is displayed and enabled
	 * @param element
	 * @param sText
	 * @throws IOException 
	 * @throws Exception
	 */	
	
	public static void verifywebElement(WebElement element,String sText) {
		try{
		if (!element.isDisplayed() && !element.isEnabled() ){
				log.error(sText+": is not displayed  or not enabled");
				
				
		}
		} catch (Exception e){
			
			log.error("Exception occurred" +e);
			e.printStackTrace();
		}
		
	}
/**
 * This method is used for clicking the webelement
 * @param element
 * @param sText
 * @throws Exception
 */	
public void clickWebElement(WebElement element,String pageElement){	
		verifywebElement(element,pageElement);
		try {
		element.click();
		Log.info(pageElement+ ": is clicked successfully");
		
		}catch(Exception e){
			
			log.error(pageElement + ": is not Clicked successfully");
			e.printStackTrace();
		}
		
	}


/**
 * This method is used for entering the text in the fields
 * @param element
 * @param sText
 * @throws Exception
 */	
	public void enteredText(WebElement element,String pageElement,String sKeys){
		verifywebElement(element,pageElement);
		
		try {
		element.sendKeys(sKeys);
		log.info(sKeys + "is entered successfully");
		}catch (Exception e){
			log.error("Field is not available");
			e.printStackTrace();
		}
	}
//*****This method is used for verifying the header of the page
/**
 * This method is used for entering the text in the fields
 * @param webElement
 * @param Req
 * @throws Exception
 */	
		public void verifyTitleActtoExp(WebElement webElement, String Req){
			String Act=webElement.getText();
			System.out.println("Actual Page header:"+Act);
			try{
			if (Act.equals(Req)){
				log.info(Act+ ": Actual and Expected page headers are matched");
			}else{
				log.error(Act+ ": Actual and Expected page headers are not matched");
				
			}
			} catch (Exception e){
				log.error("Exception occurred");
				e.printStackTrace();
			}	
		}

		
		
		/**
		 * This method is used for uploading the file in browse window
		 * @param oElement
		 * @param Req
		 * @throws Exception
		 */	
		public void browseButtonToOpenMyComputerWindow(WebElement webElement) throws InterruptedException, AWTException{
			try {
			webElement.click();
			Thread.sleep(5000);
			String path = new String(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\fileupload.exe");  
			Runtime.getRuntime().exec(path);
		
			}catch (Exception e){
				log.error("Unable to Open My Computer Window");
				e.printStackTrace();
			}
			
		}
		
		/**
		 * This method is used for checkbox verification
		 * @param oElement
		 * @param sText
		 * @throws Exception
		 */	
		

		public static void checkboxSelection(WebElement oElement,String sText){
			try{
			verifywebElement(oElement,sText);
			if(!oElement.isSelected()){
				Log.info(sText + ": is clicked");
				oElement.click();
			}
			}
			catch (Exception e){
				log.error(sText+ ": Checkbox is not found");
				e.printStackTrace();
			}
		}
		
		/**
		 * This method is used for radiobutton verification
		 * @param oElement
		 * @param sText
		 * @throws Exception
		 */	
		public static void radiobuttonSelection(WebElement oElement,String sText){
			try{
			verifywebElement(oElement,sText);
			if(!oElement.isSelected()){
				oElement.click();
		        
			}
		
			}
			catch (Exception e){
				log.error("Checkbox is not found");
				e.printStackTrace();
			}
		}
		
		
		/**
		 * This method is used for drop down value selection
		 * @param webElement
		 * @param sType
		 * @param i
		 * @throws Exception
		 */	
		
		public void selectdropdownvalue(WebElement webElement,String sType,String sVal){
			try{
				Select listbox=new Select(webElement);
				switch (sType){
				 case "selectByValue":
				 listbox.selectByValue(sVal);
				 Log.info(sVal + "is selected"); 
				 break;
				 
					 
				 case "selectByVisibleText":
					 listbox.selectByVisibleText(sVal);
					 Log.info(sVal + "is selected"); 
					 break;	 
					 
				 case "selectByIndex":
				 listbox.selectByIndex(Integer.parseInt(sVal));
				 Log.info(sVal + "is selected"); 
				 break;
					 
				}
			
				
			}catch (Exception e){
				log.error("Exception occurred");
				e.printStackTrace();
			}

			
		}
	
		/**
		 * This method is used for Explicit wait
		 * @param locator
		 * @param timeout
		 * @throws Exception
		 */	
	public static void clickWhenReady(By locator, int timeout) {
	 
	WebElement element = null;
	 
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	
	//Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);	 
	element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	element.click(); 
	 }
	
	//**** This method is used for clicking the required record in result table
	public String clickRecordWebtableclass(WebElement oElement1, WebElement oElement2, String strText)
    {
    	try{
    	WebElement Table = oElement1;
        int Row_count =  Table.findElements(By.tagName("tr")).size();
        Log.info("Number Of Rows = "+Row_count);
        
        System.out.println("Number Of Rows = "+Row_count);
           @SuppressWarnings("unused")  
           int j=0;
           
           @SuppressWarnings("unused")
         Boolean F= false;  
            for (int i=1;i<=Row_count;i++)
           {
            	//log.info(i);      	
            	//Log.info(oElement2.getText());
            	//Locator=By.xpath(".//*[@id='resultTable']/tbody/tr["+(i)+"]/td[2]");
            	 System.out.println(oElement2.getText());
            	 System.out.println("i value  " +i);
             if( oElement2.getText().equals(strText))
             {
            	// Log.info(strText+ " is available in the grid");
            	 System.out.println(strText+ " is available in the grid");
            	 System.out.println(i+ " is the id");
              j=i;
             
              F = true;
              
              WebElement link = oElement2; 
              link.click();
              break;
             }
            
           
            }
            if ( F = false  ){
            	//Log.error("Required record is deleted/not available in the table grid");
            	System.out.println(strText+ " is not available in the grid");
             	       
    	}         
           
             
    	}    
            catch(Exception e){
        	Log.error("Required table is not identified");
        	e.printStackTrace();
     	}
    	return strText;
    		
    }
	
	 //*****This method is used for verifying the Webtableclass like Results table
	public String webtableclass(WebElement oElement1,  String strText)
    {
    	try{
    	WebElement Table = oElement1;
        int Row_count =  Table.findElements(By.tagName("tr")).size();
        Log.info("Number Of Rows = "+Row_count);
        System.out.println("Number Of Rows = "+Row_count);
           @SuppressWarnings("unused")  
           int j=0;
           @SuppressWarnings("unused")
         Boolean F= false; 
            	int i=1;
            	while (i<=Row_count)
           {	
            	log.info(i);
            	System.out.println(i);
            	
            	
            	String requiredText=Table.findElement(By.xpath("//tr["+(i)+"]/td[2]")).getText();
            	System.out.println(requiredText);
            	
            	//log.info(s);
            	
            	
            	
             if(requiredText.equals(strText))
             {
            	 System.out.println(strText+ " is  available in the grid");
            	 log.info(strText+" is available in the grid");
              j=i;     
              F = true;
              WebElement checkbox = Table.findElement(By.xpath("//tr["+(i)+"]/td[1]"));
              checkbox.click();
              break;
             
              
             }
             i++;
             
            
            }
           
            
            if ( F = false  ){
            	Log.error("Required record is deleted/not available in the table grid");
             	       
    	}   
           
            
            if ( F = false  ){
            	System.out.println("Required record is deleted/not available in the table grid");
             	
             }
             
    	}    
            catch(Exception e){
        	Log.error("Required table is not identified");
        	e.printStackTrace();
     	}
    	return strText;
    		
    }
	  //*****For clicking the delete button 
    public void deletebuttonClick(WebElement oElement,String ButtonName){
    	
    	try{
    	oElement.click();
    	Log.info(ButtonName+" Is clicked successfully");
    	
    	}catch(Exception e){
    		Log.error(ButtonName+"Is not clicked successfully");
    		e.printStackTrace();
    	}
    	
    }
    
    //****For clicking the dialog delete button
    public void dialogbuttonClick(WebElement oElement,String ButtonName){
    	
    	try{
    	oElement.click();
    	Log.info(ButtonName+" Is clicked successfully");
    	//driver.findElement(By.id("dialogDeleteBtn")).click();
    	}catch(Exception e){
    		Log.error(ButtonName+"Is not clicked successfully");
    		e.printStackTrace();
    	}
    	
    }

	
	//*****For verifying that there are no records in the grid
    public void  noRecordsInGrid(WebElement oElement){
    	try{
    	WebElement NoRecords= oElement;
		     if(NoRecords.getText().contains("No Records Found"))
	     {
	      Log.info("TestPassed: Deleted record is not displayed in resultant grid");
	     }
	     else
	     {
	      Log.error("Test Failed: Deleted record is not displayed in resultant grid");
	    }
	    
    } catch (Exception e){
		Log.error("Exception occurred");
		e.printStackTrace();
	}

    }

}