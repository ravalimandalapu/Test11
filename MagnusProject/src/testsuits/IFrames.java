package testsuits;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {
	
	@Test
	public void testIframe() {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\nCodeIt\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://magnus2.jalatechnologies.com/");
		
       driver.findElement(By.xpath("//a[@href='Admin.aspx']")).click();
       
       driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("admin");;
       driver.findElement(By.xpath("//input[@id='txtpsw']")).sendKeys("admin");;
       driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
       driver.findElement(By.linkText("More")).click();
       driver.findElement(By.linkText("Iframes")).click();
      
      
       driver.switchTo().frame(driver.findElement(By.xpath("//input[@id='more-tab']/div/div[1]/iframe")));
       driver.switchTo().frame(driver.findElement(By.xpath("//input[@id='promo']/b[2]/a")));
	}

}
