package google_auto_suggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		boolean logo = driver.findElement(By.xpath("//img[@src='/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']")).isDisplayed();
		//boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		if(logo == true) {
			System.out.println("logo is present");
		}else {
			System.out.println("logo is not present");
		}
		WebElement value = driver.findElement(By.id("APjFqb"));
		value.sendKeys("gmail");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value = 'Google Search']")).click();
		WebElement search = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and text()='Gmail - Google']"));
		search.click();
		boolean logoGmail = driver.findElement(By.xpath("//img[@src = '/gmail/about/static-2.0/images/logo-gmail.png?fingerprint=c2eaf4aae389c3f885e97081bb197b97']")).isDisplayed();
		if(logo == true) {
			System.out.println("Gmail logo is dislayed ");
		}else {
			System.out.println("Gmail logo is not dislayed ");
		}
		String s = driver.getTitle();
		System.out.println(s);
		if(s.equals("Gmail: Private and secure email at no cost | Google Workspace")) {
			System.out.println("u r in gmail acc");
		}else
		{
			System.out.println("u r not in gmail acc");
		}
		
		
	    driver.quit();
		
		
		
		
		

	}
	}


