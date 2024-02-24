package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Flipkart {



			public static void main(String[] args) throws Exception {
			

				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(2000);
				try {
					driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(2000);
				try {
					driver.findElement(By.xpath("//div[@class=\"_1wE2Px\"]")).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//1st  way
				List <WebElement> birthMonth = driver.findElements(By.xpath("//*[text() = 'Electronics']"));
				System.out.println("Total Dropdown values : " + birthMonth.size());
				birthMonth.get(2).click();
				
				

	}

}
