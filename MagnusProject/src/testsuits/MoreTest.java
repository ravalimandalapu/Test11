package testsuits;

import org.testng.annotations.Test;

import pageobjects.PageActions;

import org.testng.annotations.Test;

import org.apache.log4j.Logger;

public class MoreTest {
	
	public static PageActions pageObj;
	@Test
	public void morePage() throws Exception {
		
		try {

			
			
			System.out.println("First Test ................");
			pageObj.click(pageObj.more_button, " Admin link");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
