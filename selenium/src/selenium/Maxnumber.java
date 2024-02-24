package selenium;


	import java.text.ParseException;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.text.NumberFormat;

	public class Maxnumber {
	
	    public static void main(String[] args) throws ParseException {
	    	 WebDriverManager.chromedriver().setup();
	 	    WebDriver driver = new ChromeDriver();
			 driver.get("https://money.rediff.com/gainers"); 
			 String max;
		     double m=0,r=0,s=0;
			 
		       //No. of Columns
		        List  col = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]/a"));
		        System.out.println("Total No of columns are : " +col.size());
		        //No.of rows
		        List  rows =driver.findElements(By.xpath( "//table[@class = 'dataTable']/tbody/tr/td[4]"));
		        System.out.println("Total No of rows are : " + rows.size());
		        for (int i =1;i<rows.size();i++)
		        {    
		            max= driver.findElement(By.xpath( "//table[@class = 'dataTable']/tbody/tr["+(i+1)+"]/td[4]")).getText();
		            NumberFormat f =NumberFormat.getNumberInstance(); 
		            Number num = f.parse(max);
		            max = num.toString();
		            m = Double.parseDouble(max);
		            if(m>r)
		             {    
		                r=m;
		                
		               
		            }
		            else if(r > s && m > s)
		            {
		            	s=r;
		            	
		            }
		        }
		        System.out.println("Maximum current price is : "+ r);
		        System.out.println("Second Maximum current price is : "+ s);  
		        
	    }
	}

