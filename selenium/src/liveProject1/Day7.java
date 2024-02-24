package liveProject1;

import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Day7 {
		public static String firstName = "SUNDUS";    // These testdata stuff will be placed    
		  public static  String lastName = "FIRDOUS";  // in a TestData EXCEL file at some stage
		  public  static String vEmail = "sundusfirdous1186@gmail.com";
		  public static String vPW = "Sundus@123";

		public static void main(String[] args) throws Exception {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver  = new FirefoxDriver();
			driver.manage().window().maximize();
		    driver.get("http://live.techpanda.org/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='footer']//following::a[@title='My Account']")).click();
			 driver.findElement(By.xpath("//label[@for='email']//following::input[1]")).sendKeys("sundusfirdous1186@gmail.com");
			 driver.findElement(By.xpath("//label[@for='email']//following::input[2]")).sendKeys("Sundus@123");
			 driver.findElement(By.xpath("//button[@title='Login']")).click();
			 driver.findElement(By.linkText("MY ORDERS")).click();
			 driver.findElement(By.linkText("VIEW ORDER")).click();
	
			 //Verify  TEXT
			 String exp = "ORDER #100021730 - PENDING";
			 WebElement OrderP  = driver.findElement(By.xpath("//h1[text()='Order #100021730 - Pending']"));
			 String act1 = OrderP.getText();
			    System.out.println(" Pending Message : " + act1);
			    Assert.assertEquals(act1,exp);
							 System.out.println("*** Recent Orders to get displayed ***");
							 
					        driver.findElement(By.linkText("Print Order")).click();   	  
					        // switching to new window                                                                             
						    for (String handle : driver.getWindowHandles()) {
						    	driver.switchTo().window(handle);	        
						    }
}
}