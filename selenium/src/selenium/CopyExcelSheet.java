package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	public class CopyExcelSheet {

	    public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open the source workbook
	            FileInputStream sourceFile = new FileInputStream("path/to/source/workbook.xlsx");
	            Workbook sourceWorkbook = new XSSFWorkbook(sourceFile);
	            Sheet sourceSheet = sourceWorkbook.getSheet("Sheet1");

	            // Open the destination workbook
	            FileInputStream destFile = new FileInputStream("path/to/destination/workbook.xlsx");
	            Workbook destWorkbook = new XSSFWorkbook(destFile);
	            Sheet destSheet = destWorkbook.getSheet("Sheet1");

	            // Get the data from the web page using Selenium
	            driver.get("https://example.com");
	            WebElement dataElement = driver.findElement(By.id("data-id"));
	            String data = dataElement.getText();

	            // Find the row and column to copy the data to in the destination sheet
	            int destRowNum = 1; // specify the row number
	            int destColNum = 1; // specify the column number

	            // Create a new row in the destination sheet if it doesn't exist
	            Row destRow = destSheet.getRow(destRowNum);
	            if (destRow == null) {
	                destRow = destSheet.createRow(destRowNum);
	            }

	            // Create a new cell in the destination row
	            Cell destCell = destRow.createCell(destColNum);

	            // Set the cell value to the data obtained from the web page
	            destCell.setCellValue(data);

	            // Save the changes to the destination workbook
	            FileOutputStream outputStream = new FileOutputStream("path/to/destination/workbook.xlsx");
	            destWorkbook.write(outputStream);
	            outputStream.close();

	            // Close the workbooks
	            sourceWorkbook.close();
	            destWorkbook.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the WebDriver
	            driver.quit();
	        }
	    }
	}


