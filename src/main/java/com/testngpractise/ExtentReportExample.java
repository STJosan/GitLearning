package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportExample {
public static WebDriver driver;

//Generic variables for extent reports

public static ExtentTest test;
public static ExtentReports report;
	@Test
	public void AmazonTestcase1()
	{
		//Step 1 - Define the location for your html report
		report = new ExtentReports("./Report/report.html");
		
		WebDriverManager.chromedriver().setup();
		//Step 2 - Providing the name for the Test case

		test = report.startTest("Amazon Test case 1");
		
		driver = new ChromeDriver();
		
		test.log(LogStatus.INFO, "Browser Open Success");

		driver.manage().window().maximize();
		
		test.log(LogStatus.PASS, "The Amazon website is launched successfully");

		driver.get("https://www.amazon.in/");
		
		test.log(LogStatus.PASS, "The Amazon website is launched successfully");

		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));		

		SearchBox.sendKeys("Shirts");
		
		test.log(LogStatus.PASS, "Shirts search keyword is entered into the Search box successfully");

		WebElement SearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		SearchIcon.click();
		
		test.log(LogStatus.PASS, "Click on Search Icon");
		
		//To verify it from the URL Parameters

		String CurrentURL = driver.getCurrentUrl();

		System.out.println(CurrentURL);

		if(CurrentURL.contains("Shirts"))
		{
			System.out.println("The Page is redirected to shirts correctly");
			test.log(LogStatus.PASS, "The Page is redirected to shirts correctly");
		}
		else
		{
			System.out.println("URL Redirection error");
			test.log(LogStatus.FAIL, "URL Redirection error");
		}

		driver.quit();
		test.log(LogStatus.INFO, "Browser Closed Success");
		
		//End your Extent report
				report.endTest(test);

				report.flush();
	}
}