package com.testngpractise;

import org.testng.annotations.Test;

public class SettingPriorityExample {
	
	@Test(priority=0)
	public void OpenBrowser()
	{
		System.out.println("Open Browser");
	}

	@Test (priority=1)
	public void Login()
	{
		System.out.println("Login");
	}
	
	@Test (priority=2)
	public void AddItemCart()
	{
		System.out.println("AddItemCart");
	}

	@Test(priority=3)
	public void AddMobileItem()
	{
		System.out.println("AddMobileItem");
	}

	@Test(priority=4)
	public void CloseBrowser()
	{
		System.out.println("CloseBrowser");
	}

}
