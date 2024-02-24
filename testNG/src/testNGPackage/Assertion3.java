package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	
	@Test
	public void testCase2()
	{
		String actualText = "abc";
		String expectedText = "ab";
		try {
			Assert.assertEquals(actualText, expectedText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
