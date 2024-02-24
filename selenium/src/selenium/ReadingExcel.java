package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of Excel File
		File src = new File("/Applications/Microsoft Excel.app");
		
		//Load File
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load Worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Print the  loaded sheet name
		System.out.println(sh.getSheetName());
			
		//Print Selenium from Excel Sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		//Print Java from Excel  Sheet
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		
		//Print Float/Double from Excel  Sheet
		System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());
		
		//Print Integer from Excel  Sheet
	    System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());
				
		//Print total number of rows - 1st way
	    System.out.println("Total Rows :- " + sh.getPhysicalNumberOfRows());
	    
	    //Print total number of rows - 2nd way
	    System.out.println("Total Rows :- " + (sh.getLastRowNum()+1));
	    
	    //Print total number of columns - 1st way
	    System.out.println("Total Columns :- " + sh.getRow(1).getLastCellNum());
	    		
		//Print total number of columns - 2nd way
	    System.out.println("Total Columns :- " + sh.getRow(1).getPhysicalNumberOfCells());
	  
	    //Real Time Implementation
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.facebook.com/");
	    
	    //Enter username using excel file
	    String abc = sh.getRow(1).getCell(1).getStringCellValue();
	    driver.findElement(By.id("email")).sendKeys(abc);
	    
	    
	    
	}
}
