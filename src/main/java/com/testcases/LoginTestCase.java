package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjects.LoginPageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class LoginTestCase {
	//This pattern in normal java technique of implmenting POM
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void StartBrowser()
	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/login");
			
	}
	
	@Test
	public void LoginTestcase()
	{
				LoginPageObjects lp = new LoginPageObjects(driver);
		
		lp.enterusername("tomsmith");
		lp.enterpassword("SuperSecretPassword!");

		//This type is to make the webelement declared without doing any action on the Page objects

		lp.submiButton().click();

		driver.quit();	
	}
	
	@Test
	public void NegativeLogin()
	{
		LoginPageObjects lp = new LoginPageObjects(driver);
		
		lp.enterusername("vemu prem");
		lp.userName().clear();
		lp.enterpassword("Neha");

		//This type is to make the webelement declared without doing any action on the Page objects

		lp.submiButton().click();
		
	}
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.quit();
	}
	
}