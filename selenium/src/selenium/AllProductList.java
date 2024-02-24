package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllProductList {

	public static void main(String[] args) throws Exception {
	
		//Setting the property of chrome browser and passing chromedriver path
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.flipkart.com/search?q=nike%20kids%20wear&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	    driver.manage().window().maximize();
	    
	   //Total number of Displayed Items
	   String displayCounts = driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText().split(" ")[5];
	  
	    
	   //Next Button
	   WebElement nextButton = driver.findElement(By.linkText("NEXT"));
	 // WebElement nextButton =  driver.findElement(By.xpath("//span[normalize-space()='Next']"));
	   
	   //JavaScript Executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0, 4000)");
		
		//Creating List - All Products
	    List<WebElement> products = driver.findElements(By.xpath("//div[@class='_4ddWXP']/a[@class='s1Q9rs']"));
	   
	    //StoringProduct Names in a ArrayList 
	    List<String> productNames = new ArrayList<String>();
	    
	    //Start count from "1"
	    int  i = 1;
	    for(WebElement names: products)
	    {
	    	productNames.add(names.getText());
	    	System.out.println(i+" "+names.getText());
	    	i++;
	    }
	    System.out.println("***************************************************************");
	    while(true)
	    {
	    	Thread.sleep(2000);
	    	nextButton.click();
	    	Thread.sleep(2000);
	    	jse.executeScript("window.scrollBy(0, 4000)");
	    	//WebElement element = driver.findElement(By.xpath("//div[@class='_2MImiq']"));
	    	//jse.executeScript("arguments[0].scrollIntoView(true);", element);
	    
	    	Thread.sleep(2000);

		   products = driver.findElements(By.xpath("//div[@class='_4ddWXP']/a[@class='s1Q9rs']"));
		  
		    for(WebElement names: products)
		    {
		    	productNames.add(names.getText());
		    	System.out.println(i+" "+names.getText());
		    	i++;
		    }
		    System.out.println("***************************************************************");
		    try {
		    	//nextButton = driver.findElement(By.linkText("NEXT"));
		    nextButton =  driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		    }catch (Exception e)
		    {
		    	System.out.println("NO MORE PRODUCTS");
		    	break;
		    }
	    
	    }
	  
	    
	    System.out.println("***************************************************************");
	    
	    jse.executeScript("window.scrollBy(0, -4000)");
	    //Storing String into Integer
	    int counter = productNames.size();
	    
	    //Converting Integer into String
	    String s = String.valueOf(counter);
	     
	    //Print out the Displayed number and Actual number
	    System.out.println("MY NUMBER OF PRODUCTS ARE:  "+counter);
	    System.out.println("TOTAL NUMBER OF DIPLAYED PRODUCTS: "+displayCounts);
	    
	    //Verify the Actual and Expected counts
	    Assert.assertEquals(s,displayCounts);
	    System.out.println("MY NUMBER OF PRODUCTS AND TOTAL NUMBER OF DIPLAYED PRODUCTS MATCHED");    
	}}