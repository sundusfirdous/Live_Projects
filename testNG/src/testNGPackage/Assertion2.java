package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {

	@Test
	public void testCase2()
	{
		String actualText = "abc";
		String expectedText = "ab";
		
		int a = 10;
		int b = 20;
		
		//Equal Assertion
        Assert.assertEquals(actualText, expectedText, "Actual and Expected are not matching");
        System.out.println("Equal Assertion Verified");
        
        //False Assertion
        Assert.assertFalse(a > b);
        System.out.println("False Assertion Verified");
        
        //True Assertion
        Assert.assertTrue(a > b);
        //Assertion Failed, Test Execution will stop here
        //Further line of code will not execute
        System.out.println("True Assertion Verified");
}
	@Test
	public void testCase3()
	
	{
		//Assertion is written in testCase2() method
		//Scope of assertion will be limited to testCase2() method only
		System.out.println("Hello testCase3() method");
	}
}
	