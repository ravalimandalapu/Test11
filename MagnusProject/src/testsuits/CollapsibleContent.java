package testsuits;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollapsibleContent {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://magnus2.jalatechnologies.com/");
		driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='txtname']")).clear();
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtpsw']")).clear();
		driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Collapsible Content")).click();
		driver.findElement(By.linkText("Accordion Collapse")).click();
		driver.findElement(By.linkText("Testing")).click();
		System.out.println("testing passed");
		driver.findElement(By.linkText("Java")).click();
		Thread.sleep(1000);
		System.out.println("java passed");
		driver.findElement(By.linkText(".NET")).click();
		Thread.sleep(1000);
		System.out.println("passed");
		driver.findElement(By.linkText("DataBase")).click();
		System.out.println("passed..");
		

	}

}

