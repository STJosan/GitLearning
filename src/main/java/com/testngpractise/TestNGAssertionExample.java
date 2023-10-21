package com.testngpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssertionExample {
	public static WebDriver driver;
	
    @Test

	public void AssertExampleProgram()

	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://in.search.yahoo.com/?fr2=inr");

		String ActualTitle = driver.getTitle();

		System.out.println("The Actual Page Title" +ActualTitle);
        //Assert is used to compare two values of any data type,it is from your TESTNG library
		//Once the assertion is a failure your script stops and it will not execute the remaining steps
	
		//Assert.assertEquals( ActualTitle,"Google Search");

		//Even though the assertion is failure we can use Soft Assert class to continue our code
		
		SoftAssert s1 = new SoftAssert();

		s1.assertEquals(ActualTitle, "Google Search");
		
		driver.quit();
		
		//Make sure assertAll method is called in the end ofteh code toe see the Assertions/check point erros

		s1.assertAll();

	}

}
