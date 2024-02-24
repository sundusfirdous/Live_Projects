package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test
	public void z()
	{
		Assert.assertTrue(3>12);
		System.out.println("z test method");
	}
	
	@Test
	public void s()
	{
		Assert.assertTrue(1>12);
		System.out.println("s test method");
	}
	
	@Test(dependsOnMethods = { "z", "s"})
	public void b()
	{
		System.out.println("b test method");
	}
}
