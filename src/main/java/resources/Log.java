package resources;


import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.*;

public class Log {
	public static Logger log = LogManager.getLogger(Log.class.getName());//
	

	 // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
		 

	 public void startTestCase(String sTestCaseName){
		
		 
		 
		 PropertyConfigurator.configure("src\\main\\java\\resources\\log4j2.xml");
		 
		 log.info("****************************************************************************************");

		 log.info("****************************************************************************************");

		 log.info("$$$$$$$$$$$$$$$$$$$$$                  "+sTestCaseName+"       $$$$$$$$$$$$$$$$$$$$$$$$$");

		 log.info("****************************************************************************************");

		 log.info("****************************************************************************************");

		}

		//This is to print log for the ending of the test case

	 public void endTestCase(String sTestCaseName){

		 log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");

		 log.info("X");

		 log.info("X");

		 log.info("X");

		 log.info("X");

		}

		// Need to create these methods, so that they can be called  

	 public static void info(String message) {

		 log.info(message);

			}

	 public static void warn(String message) {

		 log.warn(message);

		}

	 public static void error(String message) {

		 log.error(message);

		}

	 public static void fatal(String message) {

		 log.fatal(message);

		}

	 public static void debug(String message) {

		 log.debug(message);

		}




}
