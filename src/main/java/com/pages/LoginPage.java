package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		

		this.driver = driver;
	}

	By username = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input");

	By submit = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button");
	By forget = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/a/span");
	
	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("guru@gmail.com");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("Vandna@123");
	}

	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}
	public void clickForget()
	{
		driver.findElement(forget).click();
	}

}