package testRunner;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(  
	    features = "src/test/java/features/UserManagement.feature",
	    glue="stepDefinations")


public class TestRunner extends AbstractTestNGCucumberTests  {
 
}	

