package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseSimulation1 {
	public static void main(String[] args) throws Exception {
		
		//Setting the property of chrome browser and passing chromedriver path
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		Thread.sleep(2000);
		
		//Create Electronics Web Element Ref
		WebElement electro =  driver.findElement(By.xpath("//*[text() = 'Electronics']"));
		
		//Mouse Simulation using Action class
		Actions act = new Actions(driver);
		
		//Mouse hover to Elctronics
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		
		//MultiLevel Dropdown
		Thread.sleep(2000);
		WebElement electro1 =  driver.findElement(By.xpath("//a[contains(text(),'Cameras & Accessories')]"));
		act.moveToElement(electro1).build().perform();
		Thread.sleep(2000);
		WebElement electro2 =  driver.findElement(By.xpath("//a[contains(text(),'Point & Shoot')]"));
		act.sendKeys(electro2, Keys.ENTER).build().perform();
		
		//Keyboard Operations	
		driver.navigate().back();
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement fash = driver.findElement(By.xpath("//*[text() = 'Fashion']"));
		Thread.sleep(2000);
		act.sendKeys(fash, Keys.ENTER).build().perform();
		System.out.println("Fashion Option Clicked");
		WebElement fash1 = driver.findElement(By.xpath("//a[contains(text(),'Women Ethnic')]"));
		Thread.sleep(2000);
		act.sendKeys(fash1, Keys.ENTER).build().perform();
		System.out.println("Women Ethnic Option Clicked");
		
		
		//Right click on web page
		Thread.sleep(2000);
		act.contextClick().build().perform();
		
		
		
		driver.quit();
	
		
	}

}
