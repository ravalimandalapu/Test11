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

public class LoginTest {

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
	

	/*@Test
	public static void readPropertiesFile(){
	    Properties prop = new Properties();
	    try {


	        InputStream input = new 
	FileInputStream("C:\\Users\\hp\\Desktop\\nCodeIt\\config.properties");
	        prop.load(input);
	     
	        System.out.println(prop.getProperty("username"));
	        System.out.println(prop.getProperty("password"));
	        pageObj.click(pageObj.admin_link, " Admin link");
			pageObj.type(pageObj.admin_login_username_txt, "admin");
			pageObj.type(pageObj.admin_login_password_txt, "admin");
			pageObj.click(pageObj.admin_login_button, "Clicking the Login button");


	    } catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	} */
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
			pageObj.click(pageObj.more_button, " more link");
			pageObj.click(pageObj.more_button_menu, " menu link");
			pageObj.click(pageObj.testing, "Testing");
			
			
			WebElement button = driver.findElement(By.id("b1"));

		    if(button.getAttribute("name").matches("Enable"))
		    {
		        System.out.println("You have selected testing window");
		        //return true;
		    }
		   
		    

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	// Capturing
	@Test
	public void getTextPopup() {
		/*click more
		click popup
		Strion str=driver.getText();
		Assert.assertEquals(actual, expected);
		sysout(::)
		driver.get*/
		
	}
	
	
}




