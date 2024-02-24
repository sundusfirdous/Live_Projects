package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		
		//Setting the property of chrome browser and passing chromedriver path
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching Frame
		driver.switchTo().frame(0);
		System.out.println("Switched to Frame");
		
		//Draggable Web element
		WebElement drag = driver.findElement(By.id("draggable"));
		

		//Droppable Web element
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Drag and Drop using Action class
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 100, 60).build().perform();
		
		//Drag the Web element and click and Hold using Coordinates
		Thread.sleep(2000);
		act.clickAndHold(drag).dragAndDropBy(drag, 100, 60).build().perform();
		
		
		
	}
}
