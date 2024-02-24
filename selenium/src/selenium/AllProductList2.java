package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllProductList2 {

	public static void main(String[] args) throws Exception {
	
		//Setting the property of chrome browser and passing chromedriver path
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.flipkart.com/search?q=nike%20kids%20wear&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	    
	    //Create List - All  Companies
	  
	   // String displayCounts = driver.findElement(By.xpath("//span[@class='_2tDckM']")).getText();
	    
	 
	 
	   
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0, 3000)");
		
		
		int paginationSize = driver.findElements(By.xpath("//a[@class='ge-49M']")).size();
	   
	  
	    
	    
	    List<String> productNames = new ArrayList<String>();
	    
	    for(int i = 1; i<=paginationSize; i++)
	    {
	    String PaginatorSelector = "//a[@class='ge-49M']["+i+"]";
	    driver.findElement(By.xpath(PaginatorSelector)).click();
	    List<WebElement> products = driver.findElements(By.xpath("//div[@class='_4ddWXP']/a[@class='s1Q9rs']"));
	    
	    try {
			for(WebElement product : products)
			{
				productNames.add(product.getText());
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	   
	    for(String name: productNames)
	    {
	    	System.out.println(name);
	    }
	    int totalNames = productNames.size();
	    String displayCounts = driver.findElement(By.xpath("//span[@class='_10Ermr']")).getText().split(" ")[5];
	    
	  
	    
	  
	    System.out.println("MY NUMBER OF PRODUCTS ARE:  "+totalNames);
	    System.out.println("TOTAL NUMBER OF DIPLAYED PRODUCTS: "+displayCounts);
	    Assert.assertEquals(displayCounts, String.valueOf(totalNames));	    
	}}