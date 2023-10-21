package com.testngpractise;

import java.io.File;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class OtherAnnotationsExample {
	//Run a test case n number of times
	@Test (invocationCount = 5, description ="This is test case1")
	public void Testcase1()

	{
		System.out.println("Test case1");
	}

	//Enable or disable a test case before executing
	
	@Test(enabled=false)
	public void Testcase2()
	{
		System.out.println("Test case2");
	}
	
	//Depedends on method executes based on the test case depends

	@Test(dependsOnMethods = {"Testcase2"})
	public void Testcase3()
	{
		System.out.println("Test case3");
	}
	
	@Test (expectedExceptions = FileNotFoundException.class )
	public void Testcase4()
	{
		File f = new File("");
	}
}
