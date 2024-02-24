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

public class CountNonBlankRows {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the workbook
            FileInputStream file = new FileInputStream("path/to/workbook.xlsx");
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet("Sheet1");

            // Get the data from the web page using Selenium
            driver.get("https://example.com");
            WebElement dataElement = driver.findElement(By.id("data-id"));
            String data = dataElement.getText();

            // Find the row and column to copy the data to
            int rowNum = 1; // specify the row number
            int colNum = 1; // specify the column number

            // Create a new row in the sheet if it doesn't exist
            Row row = sheet.getRow(rowNum);
            if (row == null) {
                row = sheet.createRow(rowNum);
            }

            // Create a new cell in the row
            Cell cell = row.createCell(colNum);

            // Set the cell value to the data obtained from the web page
            cell.setCellValue(data);

            // Save the changes to the workbook
            FileOutputStream outputStream = new FileOutputStream("path/to/workbook.xlsx");
            workbook.write(outputStream);
            outputStream.close();

            // Count the total number of non-blank rows in the sheet
            int totalRows = countNonBlankRows(sheet);
            System.out.println("Total Rows (excluding blank rows): " + totalRows);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }

    private static int countNonBlankRows(Sheet sheet) {
        int rowCount = sheet.getPhysicalNumberOfRows();
        int nonBlankRowCount = 0;

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                boolean isRowBlank = true;
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    if (cell.getCellType() != CellType.BLANK) {
                        isRowBlank = false;
                        break;
                    }
                }
                if (!isRowBlank) {
                    nonBlankRowCount++;
                }
            }
        }

        return nonBlankRowCount;
    }
}




