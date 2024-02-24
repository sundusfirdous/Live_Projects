package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[contains(@id,\"u_0\")]")).click();
		
		Thread.sleep(2000);
		
		//1st  way   [[[[[[[[[ right one]]]]]]]]]]
		List <WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Dropdown values : " + birthMonth.size());
		birthMonth.get(8).click();
		Thread.sleep(2000);
		
		//2nd way  [[[[[[right]]]]]]]]]]
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");//Apr
		Thread.sleep(2000);
		month.selectByValue("12");//Dec
		Thread.sleep(2000);
		month.selectByIndex(7);//Aug
		System.out.println(month.getFirstSelectedOption().getText());//Aug current selected value
		Thread.sleep(2000);
		
		//3rd way
		List<WebElement> dropdown  = month.getOptions();
		for(int i = 0; i < dropdown.size(); i++){
		if(dropdown.get(i).getText().equalsIgnoreCase("Sep"))
		{
			dropdown.get(i).click();
		}
			
		}
		
		//4th way
	    WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		bm1.sendKeys("Jun");
		
		//5th way
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Mar");
		
		//Check if dropdown support multi
		System.out.println(month.isMultiple());//false
		month.selectByVisibleText("Apr");//Apr
		month.selectByValue("12");//dec
		month.selectByIndex(7);//Aug
		
		//Deselect the multi selected value from dropdown
		month.deselectByVisibleText("Apr");//Apr
		month.deselectByValue("12");//dec
		month.deselectByIndex(7);//Aug
		month.deselectAll();//Deselect all selected values
	}

}

/* HOW TO SCROLL DROPDOWN

//Other way that I prefer is:
JavascriptExecutor je = (JavascriptExecutor) driver;
je.executeScript("arguments[0].scrollIntoView(true);", optionList.get(17) );
Thread.sleep(250);

*/