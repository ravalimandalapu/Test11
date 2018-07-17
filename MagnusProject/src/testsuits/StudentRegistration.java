package testsuits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentRegistration {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://magnus2.jalatechnologies.com/");
	
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		driver.findElement(By.xpath("//div[@id='myNavbar']/child::ul/child::li[1]/a")).click();
		driver.findElement(By.xpath("//a[@href='register.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("value");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("email@gmail.com");
		driver.findElement(By.xpath("//input[@id='mnum']")).sendKeys("8798765423");
		driver.findElement(By.xpath("//input[@id='radiobtn_0']")).click();
		driver.findElement(By.xpath("//select[@id='ddlcountry']")).sendKeys("usa");
		driver.findElement(By.xpath("//select[@id='ddlcity']")).sendKeys("madsion");
		driver.findElement(By.xpath("//input[@id='CheckBoxList1_0']")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("11/06/1992");
		
		driver.findElement(By.xpath("//input[@id='btnsubmit']")).click();
		
	}

}


