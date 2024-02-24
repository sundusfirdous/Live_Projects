package com.group.TestNG;

import org.testng.annotations.Test;

public class NewTest2 {
	
	@Test(groups = {"smoke"})
	public void test4()
	{
		System.out.println("Hello test4 method");
	}
	
	@Test(groups = {"sanity","smoke","functional","ios.smoke"})
	public void test5()
	{
		System.out.println("Hello test5 method");
	}
	
	@Test(groups = {"functional","regression","windows.functional","ios.functional"})
	public void test6()
	{
		System.out.println("Hello test6 method");
	}
	
	@Test(groups = {"functional"})
	public void test7()
	{
		System.out.println("Hello test7 method");
	}
}


