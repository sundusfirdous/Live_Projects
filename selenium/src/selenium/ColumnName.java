package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

	public class  ColumnName {
		

		
		    public static void main(String[] args) {
		    	  WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://money.rediff.com/gainers");

		        String desiredWord = "61.22";
		        WebElement table = driver.findElement(By.className("dataTable"));

		        // Find all header cells
		        List<WebElement> headers = table.findElements(By.tagName("th"));

		        // Iterate through each row
		        for (WebElement row : table.findElements(By.tagName("tr"))) {
		            // Find all data cells in the current row
		            List<WebElement> cells = row.findElements(By.tagName("td"));

		            // Iterate through each data cell to find the desired word
		            for (int i = 0; i < cells.size(); i++) {
		                if (cells.get(i).getText().equals(desiredWord)) {
		                    // Print the column name associated with the matched cell
		                    System.out.println("Column Name: " + headers.get(i).getText());
		                    break;
		                }
		            }
		        }

		        driver.quit();
		    }
		}
