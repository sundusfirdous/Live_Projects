package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) {
		
		//Setting the property of chrome browser and passing chromedriver path
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching Frame
		driver.switchTo().frame(0);
		System.out.println("Switched to Frame");
		
		//Draggable Web element
		WebElement drag = driver.findElement(By.id("draggable"));
		

		//Droppable Web element
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Drag and Drop using Action class
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
	}
}
