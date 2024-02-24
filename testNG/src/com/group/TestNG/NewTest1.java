package com.group.TestNG;
	import org.testng.annotations.Test;
	@Test(groups = {"all"})

	public class NewTest1 {
		
		

		@Test(groups = {"smoke","sanity","regression","windows.smoke"})
		public void test1()
		{
			System.out.println("Hello test1 method");
		}
		
		@Test(groups = {"smoke", "functional", "sanity","windows.sanity","ios.sanity"})
		public void test2()
		{
			System.out.println("Hello test2 method");
		}
		
		@Test
		public void test3()
		{
			System.out.println("Hello test3 method");
		}
}
