package com.testngpractise;

import org.testng.annotations.Test;

public class OrderOfExecutionTestNG {

    @Test
	public void amethod()
	{
		System.out.println("First method");
	}

	@Test
	public void bmethod()
	{
		System.out.println("Second method");
	}

	@Test
	public void aMethod()
	{
		System.out.println("Third method");
	}

}
