package selenium;

	import java.time.Duration;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class WebTable4 {

		public static void main(String[] args) throws Exception {
		
			//Setting the property of chrome browser and passing chromedriver path
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		 
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			 //Create List - All  Names
		    List<WebElement> allNames = driver.findElements(By.xpath("//table[@id = 'dtBasicExample']/tbody/tr/td[1]"));
		    System.out.println("Total Names Count : " + allNames.size());
		    
		    //	Create List - All Age
		    List<WebElement> allAge = driver.findElements(By.xpath("//table[@id = 'dtBasicExample']/tbody/tr/td[4]"));
		    System.out.println("Total Age Count : " + allAge.size());
			
		    String expName = "Suki Burks";
			    
			  for(int i = 0; i < allNames.size(); i++)
				    
			    {
			    	if (allNames.get(i).getText().equalsIgnoreCase(expName))
			    	{
			    		System.out.println(allNames.get(i).getText() + "====" + allAge.get(i).getText());
			             allNames.get(i).click();		             
			           	}
			    }int j=1;
			    
			   do {
			    	String n1="//a[normalize-space()="+j+"]";
			    	driver.findElement(By.xpath(n1)).click();
			    	Thread.sleep(2000);
					jse.executeScript("window.scrollBy(0, 10)");
					Thread.sleep(2000);
					allNames = driver.findElements(By.xpath("//table[@id = 'dtBasicExample']/tbody/tr/td[1]"));
					Thread.sleep(2000);
					allAge = driver.findElements(By.xpath("//table[@id = 'dtBasicExample']/tbody/tr/td[4]"));
					Thread.sleep(2000);
					
			    	  for(int i = 0; i < allNames.size(); i++)
			    		    
			  	    {
			  	    	if (allNames.get(i).getText().equalsIgnoreCase(expName))
			  	    	{
			  	    		System.out.println(allNames.get(i).getText() + "====" + allAge.get(i).getText());
			  	             allNames.get(i).click();		  	             
			  	          
			  	    	}
			  	    }
			   
			 	    
			  j++;  } while(j<=6);
	}}
			    	
			    
		    



