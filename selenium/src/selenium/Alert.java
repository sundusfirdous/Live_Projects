package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Alert {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		//Alert Handling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		//Verify Alert Text
		String expAlertText  = "Do you confirm action?";
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText, expAlertText);
		System.out.println("Alert Text Verified");
		
		//Accept the alert
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted");
		
		//Dismiss the alert
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		
		driver.quit();
		
	}

}
