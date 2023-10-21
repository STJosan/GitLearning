package com.testngpractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsExample {
	@BeforeSuite
	public void BeforeSuiteMethod()

	{
	//We give the group or the test cases to executed, we can define browser or mobile
		System.out.println("BeforeSuite");

	}	

	@BeforeTest

	public void BeforeTestMethod()

	{
		//Code for launching the browsers or setting up the enronment

		System.out.println("BeforeTest");
	}
	@BeforeClass
	
    public void BeforeClassMethod()

    {
		//Code for for dependency or imports, SQL Connectors
		System.out.println("BeforeClass");
    }
	//Before method will be executed each time or the number of times you have your @Test method or test case
	@BeforeMethod
   public void Beforemethod()

    {
		//If the file is existing
		System.out.println("BeforeMethod");
    }

	@Test
	public void Testcase1()

	{
		System.out.println("Test case1");
	}	

	@AfterMethod
	//After method will be executed each time or the number of times you have your @Test method or test case
	public void Aftermethod()
	{
		System.out.println("AfterMethod");
	}

@AfterClass
	public void AfterClassMethod()
	{
	System.out.println("AfterClass");
	}

@AfterTest
public void AfterTestMethod()
{
	System.out.println("AfterTest");
}

@AfterSuite
public void AfterSuiteMethod()

{
	System.out.println("After Suite");
}

}

