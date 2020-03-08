package com.pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginPage {
	@Test
	public void verifyLogin() {
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\NaveenKarthik\\Desktop\\driver\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		LoginPage page=new LoginPage(driver);
		page.typeUsername();
		page.typePassword();
		page.clickForget();
		//page.clickSubmit();
		/* driver.quit(); */
	}

}
