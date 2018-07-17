package pageobjects;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger");

	public PageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Admin Login Page

	@FindBy(partialLinkText = "Admin")
	public WebElement admin_link;

	@FindBy(id = "txtname")
	public WebElement admin_login_username_txt;

	@FindBy(id = "txtpsw")
	public WebElement admin_login_password_txt;

	@FindBy(id = "btnlogin")
	public WebElement admin_login_button;
	
	@FindBy(linkText = "More")
	public WebElement more_button;
	
	@FindBy(linkText= "Multiple Tabs")
	public WebElement more_button_multiple;
	
	@FindBy(linkText= "Menu")
	public WebElement more_button_menu;
	
	@FindBy(linkText="Two")
	public WebElement two;
	
    @FindBy(className="form-control")
	public WebElement form_control_two_txt;
	
	@FindBy(linkText="Three")
	public WebElement three;
	
	
	//@FindBy(="AutoComplete")
	//public WebElement AutoComplete;
	
	@FindBy(id="b1")
	public WebElement testing;
	@FindBy(id="b2")
	public WebElement java;
	@FindBy(id="b3")
	public WebElement net;
	@FindBy(id="b4")
	public WebElement database;
	@FindBy(id="txtmblno1")
	public WebElement mobileno;
	@FindBy(id="btnsearch")
	public WebElement search;
	@FindBy(xpath="//*[@id=\"myNavbar\"]/ul/li[3]/a")
	public WebElement usersearch;
	
	
	
	
}
