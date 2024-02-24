package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) {
		
		//Setting the  property of  chrome browser and passing chromedriver path
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        
        //Enter Username
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        
        //Fetch input box attribute value
        System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
      //Fetch input box attribute value
       // System.out.println(driver.findElement(By.id("email")).getText());
        
        //Get Height of Input box
        System.out.println(driver.findElement(By.id("email")).getSize().getHeight());
        
        //Get Width of input box
        System.out.println(driver.findElement(By.id("email")).getSize().getWidth());
        
        //Use Explicit Wait to check if password field is visible
        WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");
        
        
       
	}

}
