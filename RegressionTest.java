package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.keyword.engine.KeyWordEngine;

public class RegressionTest {
	
	public KeyWordEngine RegressionTest;
	
	
	@Test
	
	public void startTest()
	{
		RegressionTest = new KeyWordEngine();
		
		RegressionTest.startExecution("login");
	}

}
