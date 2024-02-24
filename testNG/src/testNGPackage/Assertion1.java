package testNGPackage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion1 {

	@Test
	public void testCase1()
	{
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
        String actualText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
	    
        //Equal Assertion
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Equal Assertion Verified");
        
        //False Assertion
        Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).isSelected());
        System.out.println("False Assertion Verified");
        
        //True Assertion
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).isDisplayed());
        System.out.println("True Assertion Verified");
	
      /*  WebDriverWait wait = new WebDriverWait(driver, null);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));*/
	}
	
}
