package selenium;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class ScrollUpDownVerticalHorizontal {

		public static void main(String[] args) throws Exception {
			
		
		//Setting the property of chorme browser and passing chromedriver path
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.facebook.com/");
			
			//JavascriptExecutor
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			//Locate Web Element using JavaScript
			jse.executeScript("document.getElementById('email').value = 'abc@gmail.com'");
			jse.executeScript("document.getElementById('pass').value = 'abc@12345'");
		
			//Scroll Down using JavaScript
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0, 500)");
			
			//Scroll Up using JavaScript
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0, -500)");
			
			//Scroll left using JavaScript
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(-500,0)");
			
			//Scroll Right using JavaScript
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(500,0)");
		
	}
		
	
	}

