package selenium;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;



public class Selenium2 {
	
		public static void main(String[] args) throws Exception {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//Delete all cookies
	Thread.sleep(2000);
	driver.manage().deleteAllCookies();
	
	//open url using navigate()method
	Thread.sleep(2000);
	driver.get("https://www.google.com/");
	
	//Refresh the page
	Thread.sleep(2000);
    driver.navigate().refresh();
   
	//navigate to back
	driver.navigate().back();
	Thread.sleep(2000);
	
	//navigate to forward
	Thread.sleep(2000);
	driver.navigate().forward();
	
	//fetch current url
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	
	//get title of the web page
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	
	//close the browser
	driver.close();

	
		}

	



}
