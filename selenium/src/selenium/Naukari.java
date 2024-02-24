package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {
	

	    public static void main(String[] args) throws Exception {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.naukri.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("login_Layer")).click();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	       WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	       email.sendKeys("sundusfirdous687@gmail.com");
	       WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	       password.sendKeys("adnaN786");
	       WebElement login = driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
	       login.click();
	       driver.findElement(By.linkText("View profile")).click();
	//     driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
	
	   for(int i=1;i<=100000;i++) {
	     Thread.sleep(2000);
		   
//			   WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(2));
//		        wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("attachCV"))).sendKeys("/Users/noorisuhel/Downloads/Sundus_Firdous_Resume.pdf");
			driver.findElement(By.id("attachCV")).sendKeys("/Users/noorisuhel/Downloads/Sundus_Firdous_Resume.pdf");
		
	   
	  System.out.println(i);
	   }System.out.println("uploaded 100 times");}
	}
