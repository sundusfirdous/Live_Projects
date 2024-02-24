package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws Exception {
	
		//Setting the property of chrome browser and passing chromedriver path
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://money.rediff.com/gainers");
	    
	    //Create List - All  Companies
	    List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]/a"));
	    System.out.println("Total Companies Count : " + allCompanies.size());
	    
	    //	Create List - Current Price
	    List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
	    System.out.println("Total Companies Count : " + currentPrice.size());
	    
	    String expCompName = "Compucom Softwr";
	    
	    for(int i = 0; i < allCompanies.size(); i++)
	    
	    {
	    	if (allCompanies.get(i).getText().equalsIgnoreCase(expCompName))
	    	{
	    		System.out.println(allCompanies.get(i).getText() + "====" + currentPrice.get(i).getText());
	             allCompanies.get(i).click();
	             
	             break;
	    	}
	    }
	/*    List<WebElement> myList =  driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]/a"));
        List<String> allCompanies1 = new ArrayList<>();
        for(int i = 0; i<myList.size();  i++)
        {
        	allCompanies1.add(myList.get(i).getText());
        	System.out.println((myList.get(i).getText()));
        	
        }
        Object obj  = Collections.max(allCompanies1);
	    System.out.println(obj);
	    
	    int max = 0;
	    String version  = null;
	    List<WebElement> storeRows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]/a"));
	    
	    for(int i = 0; i<storeRows.size();  i++)
        {
        	WebElement columnValue = storeRows.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
        	System.out.println((myList.get(i).getText()));
        	
        }*/
	}

}
