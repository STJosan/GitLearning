package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.keyword.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	
	@Test
	public void SampleTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void SampleTest1(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("SampleTest");
	}
	
	
	
	
	

}
