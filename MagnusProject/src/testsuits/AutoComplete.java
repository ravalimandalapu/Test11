package testsuits;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://magnus2.jalatechnologies.com/");
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='txtname']")).clear();
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).clear();
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Auto Complete")).click();
		driver.findElement(By.linkText("Single Values")).click();
		driver.findElement(By.id("tags")).sendKeys("asdd");
		System.out.println("1.passed");
		
		driver.findElement(By.linkText("Multiple Values")).click();
		driver.findElement(By.id("mtags")).sendKeys("asdfd");
		
	}

}


