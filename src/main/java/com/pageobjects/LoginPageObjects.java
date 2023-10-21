package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class LoginPageObjects {
	
		//This pattern in normal java technique of implmenting POM
	
		public WebDriver driver;
		
		
		
		By userid = By.name("username");
		By password = By.id("password");
		By submitButton = By.className("radius");
		public LoginPageObjects(WebDriver driver)
		{
			this.driver=driver;
		}

		public void enterusername(String testdata)
		{
			driver.findElement(userid).sendKeys(testdata);
		}
		
		public WebElement userName()
		{
			return driver.findElement(userid);
		}
		public void enterpassword(String testdata)
		{
			driver.findElement(password).sendKeys(testdata);;
		}
		
		public WebElement submiButton()

		{
			return driver.findElement(submitButton);
		}
	}


