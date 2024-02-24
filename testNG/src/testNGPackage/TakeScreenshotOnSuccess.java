package testNGPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnSuccess {

	WebDriver driver;
	
	//ITestResult will provide us the test case execution status   and test name
	public void captureScreenshot(ITestResult result) throws Exception
	{
		if(ITestResult.SUCCESS == result.getStatus())
		{
			
			//Create  ref of TakeScreenshot Interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver;//Typecasting of 2 interface
		  
			//Use getScreenshotAs() to capture the screenshot in File Format
			//getScreenshotAs() method return type = FILE
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy the file to specific location
			File destFolder = new File("./screebshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName()+ "method() screenshot captured");
			
		}
	}
}
