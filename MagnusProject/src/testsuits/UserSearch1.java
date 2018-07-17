package testsuits;







import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.PageActions;

/**
 * 
 * @author JALA Technologies
 *
 */

public class UserSearch1 {

	WebDriver driver;
	public static PageActions pageObj;
	public static String URL = "http://magnus2.jalatechnologies.com/";
	public static String driverPath = "chromedriver.exe";
	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * Date:11-04-2018
	 * 
	 */

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method ");

		try {
			System.out.println("launching chrome browser");

			// Set driver path
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();

			// Launching the application
			driver.get(URL);
			System.out.println("Application launched successfully");

			// Page Object initilization
			pageObj = new PageActions(driver);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @throws Exception
	 */
	

	
	
	@Test
	public void loginAdmin() throws Exception {
		try {

			log.info("*************** Entering login Admin**************");
			System.out.println("First Test ................");
			pageObj.click(pageObj.admin_link, " Admin link");
			pageObj.type(pageObj.admin_login_username_txt, "admin");
			pageObj.type(pageObj.admin_login_password_txt, "admin");
			pageObj.click(pageObj.admin_login_button, "Clicking the Login button");
			
			log.info("*************** leaving login Admin**************");
			pageObj.click(pageObj.usersearch, "Usersearch");
			pageObj.type(pageObj.mobileno, "9874563210");
			pageObj.click(pageObj.search, "Clicking the search button");
			/*driver.findElement(By.xpath("a[@href='UsersSearch.aspx']")).click();
			driver.findElement(By.xpath("input[@id='txtname1']")).sendKeys("textname");
			driver.findElement(By.xpath("input[@id='txtmblno1']")).sendKeys("9876543345");
			driver.findElement(By.xpath("input[@id='btnsearch']")).click();*/
			
			
			
			
		   
		    

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	
	
	
}





