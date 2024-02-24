package testNGPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	//@Test - 1st way
	public void a()
	{
		System.out.println("Hello a Test method");
	}
	
	//2nd Way - widely used in market
	@Test(enabled = false)
	public void b()
	{
		System.out.println("Hello b Test method");
	}
	
	@Test(enabled = true)
	public void c()
	{
		System.out.println("Hello c Test method");
	}
	
	//InvocationCount - 2 times
	@Test(invocationCount = 2)
	
		public void d()
		{
		System.out.println("Hello d test method");	
		}
	//InvocationCount - 0 times
		@Test(invocationCount = 0)
		
			public void e()
			{
			System.out.println("Hello e test method");	
			}
		
		//Conditional Skipping
		@Test 
		public void f()
		{
			System.out.println("f test method");
			throw new SkipException("Skipping f test method");
		}
	
	}
	
