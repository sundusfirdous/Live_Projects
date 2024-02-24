package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;



public class IFrame {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://paytm.com");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(2000);
	    WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	    //Find the total number of frames present
	    int allFrames = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames :- " + allFrames);
	    
	    //Check if the element is present or not
	    for(int i = 0; i < allFrames; i++)
	    {
	    	driver.switchTo().frame(i);
	    	driver.switchTo().frame(i);
	    	
	    	String expText = "Open Paytm App";
	    	
	    	String abc = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
	    	if(abc.equalsIgnoreCase(expText))
	    	{
	    		System.out.println("Element Found");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("Element Not Found");
	    	}
	    }
	    
driver.quit();
	}

}
