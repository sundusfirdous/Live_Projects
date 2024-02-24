package testNGPackage;

import org.testng.annotations.*;

public class TestNG1 {

	@Test
	public void a2()
	{
		System.out.println("Hello a2 Test method");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Hello BeforeTest");
	}
	@Test
	public void a4()
	{
		System.out.println("Hello a4 Test method");
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Hello BeforeSuite");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Hello AfterMethod");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Hello BeforeClass");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Hello AfterTest");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Hello AfterClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Hello BeforeMethod");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Hello AfterSuite");
	}
	@Test
	public void a1()
	{
		System.out.println("Hello a1 Test method");
	}
	@Test
	public void a3()
	{
		System.out.println("Hello a3 Test method");
	}

	
}
