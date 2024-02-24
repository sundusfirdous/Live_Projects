package selenium;


	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class DesiredColumnWord {
	    public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        WebDriverManager.chromedriver().setup();
			
			

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();

	        // Navigate to the web page containing the dynamic table
	        driver.get("https://money.rediff.com/gainers");

	        // Replace "desiredWord" with the word you want to find in the row
	        String desiredWord = "61.22";

	        // Replace "tableId" with the actual ID or any other suitable locator of the table
	        WebElement table = driver.findElement(By.className("dataTable"));

	        // Locate all rows in the table
	        List<WebElement> rows = driver.findElements(By.tagName("tr"));

	       // Iterate through each row
	        for (WebElement row : rows) {
	            // Locate all columns in the current row
	           List<WebElement> columns = row.findElements(By.tagName("td"));

	            // Iterate through each column to find the desired word
	            for (int i = 0; i < columns.size(); i++) {
	                if (columns.get(i).getText().equals(desiredWord)) {
	                    // Print column values of the matched row
	                    for (WebElement column : columns) {
	                        System.out.println(column.getText());
	                    }
	                    break;  // Break the loop once the word is found in the row
	                }
	            }
	        }

	      
	        // Close the browser
	        driver.quit();
	    }
	}


