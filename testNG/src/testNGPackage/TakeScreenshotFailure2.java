package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotFailure2 {

	TakeScreenshotOnFailure  t1 = new TakeScreenshotOnFailure ();
	
	@Test
	public void doLogin() throws Exception{
	WebDriverManager.chromedriver().setup();
	t1.driver = new ChromeDriver();
	t1.driver.manage().window().maximize();
	//Implicit wait
    t1.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	t1.driver.get("https://www.facebook.com/");
	Thread.sleep(30);
	t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	t1.driver.findElement(By.id("pass")).sendKeys("abc@123");

	//Pass wrong id so that test case will fail
	t1.driver.findElement(By.id("email_wrong")).sendKeys("abc@gmail.com");
	}
@AfterMethod
public void takeScreenshot(ITestResult result2) throws Exception
{
	t1.captureScreenshot(result2);
	}
}