package javaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdn.WebDriver;
//import java.io.IOException;

//import org.openqa.selenium.*;


public class OpenApplication {

	public static void main(String[] args) throws Exception {
	//System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data 1/Users/noorisuhel/eclipse-workspace/chromedriver-mac-arm64/chromedriver");
//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
Thread.sleep(20000);
driver.manage().window().maximize();
Thread.sleep(20000);
driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys("password");
Thread.sleep(2000);
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
	}

}
