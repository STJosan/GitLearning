package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	public static WebDriver driver;

	@Test
	@Parameters({"userid","password"})
	public void LoginTestCase(String username, String Password) throws InterruptedException

	{

		//Using webdirver manager we can ignore the local intanse of keping exe

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		//Best Practise to follow is to maximize the browser before running the test

		driver.manage().window().maximize();

		//Give the URL to be navigated, we use get method to navigate to a URL

		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement userid = driver.findElement(By.id("username"));

		WebElement password = driver.findElement(By.name("password"));

		WebElement SubmitButton = driver.findElement(By.className("radius"));

		userid.sendKeys(username);

		password.sendKeys(Password);

		SubmitButton.click();
		Thread.sleep(4000);

		//Automatically close the browser session

		driver.close();

	}

}
