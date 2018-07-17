package framework;


	import org.apache.log4j.Logger;
	import org.openqa.selenium.WebDriver;

import pageobjects.PageActions;

	

	public class BaseTest {

		protected WebDriver driver;
		public PageActions pageObj;
		public static String URL = "http://magnus2.jalatechnologies.com/";
		public static String driverPath = "chromedriver.exe";
		protected Logger log = Logger.getLogger("devpinoyLogger");
		
	}


