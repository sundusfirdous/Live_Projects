package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;

public class RadioButton {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,\"u_0\")]")).click();
		
		//1st way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value = '1']")).click();//Female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value = '2']")).click();//Male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value = '-1']")).click();//Custom
		
		//2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type = 'radio']"));
		System.out.println("Total  Radio Buttons: " +radios.size());
		System.out.println(radios.get(2).isSelected());//false
		System.out.println(radios.get(1).isEnabled());//true
		System.out.println(radios.get(2).isDisplayed());//true
		Thread.sleep(2000);
		radios.get(1).click();//male
		radios.get(2).click();
		Thread.sleep(2000);
		System.out.println(radios.get(2).isSelected());//false
		
		
		//3rd way    [[[[[right  way]]]]]]
		List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total radio button text :" + radiosText.size());
		//((WebElement) radiosText).click();
		String expResult = "Female";
		for(int i = 0; i <radiosText.size(); i++)
		{
			if(radiosText.get(i).getText().equalsIgnoreCase(expResult))
			{	radiosText.get(i).click();
			System.out.println(expResult + " clicked");
			break;
			
		}}
	}

}
/* HOW TO SELECT ALL OPTIONS

//List<WebElement> els = driver.findElements(By.xpath("//div[@class='md-container md-ink-ripple']"));
System.out.println(Integer.toString(els.size()));

for ( WebElement el : els ) {
    el.click(); 
}
*/