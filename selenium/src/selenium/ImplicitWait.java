package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ImplicitWait {

	public static void main(String[] args) {
		
//Setting the  property of chrome and passing chromedriver path
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff Works");
		
		//Handling Auto Suggestion
		List<WebElement> AllSuggestion = driver.findElements(By.xpath("//ul[@role = 'listbox']/li"));
		for(int i = 0; i<AllSuggestion.size(); i++)
		{
			String expResult =  "How Stuff Works";
			if(AllSuggestion.get(i).getText().equalsIgnoreCase(expResult))
			{
				AllSuggestion.get(i).click();
		break;
			}
			{
				
			}
		}
		
	}

}
