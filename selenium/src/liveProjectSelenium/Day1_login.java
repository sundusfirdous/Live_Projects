package liveProjectSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day1_login {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("uid")).sendKeys("mngr544930");
	driver.findElement(By.name("password")).sendKeys("UpynEvu");
	driver.findElement(By.name("btnLogin")).click();
    System.out.println("Login Successful");
}
}
