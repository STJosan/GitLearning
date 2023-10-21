package com.seleniumgrid;
import java.net.MalformedURLException;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumgridStandalone {

	//In Selenium grid we run test cases on remote machines, we have remotedrier 
	//public static RemoteWebDriver driver;
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	public static String URL ="http://192.168.0.4:4444";
	
	@Test
	public void ChromeTest() throws MalformedURLException, InterruptedException
	{
				ChromeOptions options = new ChromeOptions();
				//Set the Grid URL for the test case to be executed

				driver.set(new RemoteWebDriver(new URL(URL), options));

				driver.get().get("https://www.google.com");
				
				driver.get().manage().window().maximize();
				
				Thread.sleep(5000);
				driver.get().quit();

	}

	public WebDriver getDriver()
	{
			return driver.get();
	}
	
	@Test
	public void FirefoxTest() throws MalformedURLException, InterruptedException
	{

		FirefoxOptions options = new FirefoxOptions();

		//Set the Grid URL for the test case to be executed

		driver.set(new RemoteWebDriver(new URL(URL), options));

		driver.get().get("https://www.google.com");

		driver.get().manage().window().maximize();

		Thread.sleep(5000);

		driver.get().quit();

	}
}
