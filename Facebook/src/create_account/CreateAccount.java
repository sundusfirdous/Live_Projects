package create_account;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyUp(Keys.PAGE_UP).build().perform();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0, -1000)");
		
		//All links on current page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement allLinks : links) {
			System.out.println(allLinks.getAttribute("href"));
		}
		
		//Login
		driver.findElement(By.id("email")).sendKeys("Sundus@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sundus");
		driver.findElement(By.name("login")).click();
		
		//Verify error msg 
		String exp = "The password you've entered is incorrect.";
		WebElement msg = driver.findElement(By.xpath("//span[@class='_akzt']"));
		String actual = msg.getText();
		Assert.assertEquals(actual,exp);
		System.out.println("Both actaul and exp are matched");
		String x1 = msg.getCssValue("color");
		System.out.println(x1);
		String x2 = msg.getCssValue("font-size");
		System.out.println(x2);
		String x3 = msg.getCssValue("font-family");
		System.out.println(x3);
		String x4 = msg.getCssValue("background");
		System.out.println(x4);
		String x5 = msg.getCssValue("font-weight");
		System.out.println(x5);
		driver.navigate().back();
       
		//Logo id Displayed or not
		Boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if(logo == true) {
			System.out.println("logo is displayed");
		}else {
			System.out.println("logo is not displayed");
		}
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(2000);
		
		//Find out u r in a correct page or not
		String s = driver.getCurrentUrl();
		if(s.equals("https://www.facebook.com/")) {
			System.out.println("u r in fb create account page");
		}else {
			System.out.println("u r not in fb create account page");
		}
		
		//Create an Account  
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sundus");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Firdous");
		String username = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		String password = driver.findElement(By.xpath("//input[@name='lastname']")).getAttribute("value");
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.name("reg_email__")).sendKeys("sundusfirdous@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sundusfirdous@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sundusFirdous123!");
		
		//For Birthday Dropdown by List
		List<WebElement> birthDay = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
		System.out.println("Total number of Elements present in Birth Date " +birthDay.size());
		birthDay.get(8).click();

		//For Birth Month Dropdown by Select
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select bm = new Select(birthMonth);
		bm.selectByIndex(8);
		
		//For Birth Year Dropdown by Select
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select by = new Select(birthYear);
		by.selectByValue("2013");
		
		//Select RadioButton 
		List<WebElement> radioBtn = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total number of radiobutton : "+radioBtn.size());
		String expresult = "Female";
		for(int i=0; i< radioBtn.size(); i++)
			{
			if(radioBtn.get(i).getText().equalsIgnoreCase(expresult))
			{
				radioBtn.get(i).click();
				
				System.out.println(expresult + " Clicked");
				
				break;
			}
			}
		
		//isSelected
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type = 'radio']"));
		System.out.println("Total  Radio Buttons: " +radios.size());
		System.out.println(radios.get(0).isSelected());
	
		
		//isDisplayed
		System.out.println(radioBtn.get(1).isDisplayed());
		System.out.println(radioBtn.get(1).isEnabled());
		
		//For selecting all options
		List<WebElement> radioText = driver.findElements(By.xpath("//label[@class='_58mt']"));
		
		for(WebElement allOpt : radioText) {
			allOpt.click();
			System.out.println(allOpt.getText());}
		
		WebElement pronounce = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		
		Select bm1 = new Select(pronounce);
		bm1.selectByIndex(3);
		
		
		
		
		driver.findElement(By.name("custom_gender")).sendKeys("Female");
		
		
		
		//Click on Submit
		driver.findElement(By.name("websubmit")).click();
		
		
		
	driver.quit();

	}}


