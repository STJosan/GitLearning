package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutopnExample {
	
	public static WebDriver chromeDriver;

	public static WebDriver firefoxDriver;

	@Test
	public void LoginChromeTest()
	{

		WebDriverManager.chromedriver().setup();

		chromeDriver = new ChromeDriver();
		
		chromeDriver.manage().window().maximize();		

		//Give the URL to be navigated, we use get method to navigate to a URL

		chromeDriver.get("https://the-internet.herokuapp.com/login");

		WebElement userid = chromeDriver.findElement(By.id("username"));

		WebElement password = chromeDriver.findElement(By.name("password"));

		WebElement SubmitButton = chromeDriver.findElement(By.className("radius"));

		userid.sendKeys("tomsmith");

		password.sendKeys("SuperSecretPassword!");

		SubmitButton.click();
		chromeDriver.close();
	}

	@Test
	public void LoginFirefoxeTest()
	{

		WebDriverManager.firefoxdriver().setup();

		firefoxDriver = new FirefoxDriver();

		firefoxDriver.manage().window().maximize();		//Give the URL to be navigated, we use get method to navigate to a URL

		chromeDriver.get("https://the-internet.herokuapp.com/login");

		WebElement userid = chromeDriver.findElement(By.id("username"));

		WebElement password = chromeDriver.findElement(By.name("password"));

		WebElement SubmitButton = chromeDriver.findElement(By.className("radius"));

		userid.sendKeys("tomsmith");

		password.sendKeys("SuperSecretPassword!");

		SubmitButton.click();
		//firefoxDriver.quit();
	}
}
