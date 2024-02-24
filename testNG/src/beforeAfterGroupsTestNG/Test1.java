package beforeAfterGroupsTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void a2()
	{
		System.out.println("Hello a2 Test method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Hello BeforeTest");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup()
	{
		System.out.println("run this Before regression");
	}
	
	@AfterGroups(value="regression")
	public void afterGroup()
	{
		System.out.println("run this after regression");
	}
	
	@Test(priority = 1, groups = "regression")
	public void a4()
	{
		System.out.println("Hello a4 regression1 Test method");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Hello BeforeSuite");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Hello AfterMethod");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Hello BeforeClass");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Hello AfterTest");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Hello AfterClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Hello BeforeMethod");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Hello AfterSuite");
	}
	@Test
	public void a1()
	{
		System.out.println("Hello a1 Test method");
	}
	@Test(priority = 2, groups = "regression")
	public void a3()
	{
		System.out.println("Hello a3 regression2 Test method");
	}

	
}



