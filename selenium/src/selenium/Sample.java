package selenium;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  Sample {

    private static final Logger logger = Logger.getLogger(Sample.class);

    public static void main(String[] args) {
    	//Configure log4j properties file
    			PropertyConfigurator.configure("/Users/noorisuhel/eclipse-workspace1/selenium/log4j.properties");
    			
    			//Open Browser Instance
    			WebDriverManager.chromedriver().setup();
    			WebDriver driver  = new ChromeDriver();
    			driver.get("https://www.facebook.com/");
    			logger.info("chrome broser instance opened");
        try {
            // Code that may throw an exception
            throw new Exception("This is a sample exception");
        } catch (Exception e) {
            // Log the exception with ERROR level
            logger.error("\u001B[31m" + "Error occurred: " + e.getMessage() + "\u001B[0m", e);
        }
    }
}

