package BasePackage;

import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utility.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
    
	   public static WebDriver driver;  
	  
	   public void Initialize() throws IOException {
	        driver = getDriver();
	        driver.get(ReadProperties.FileRead("URL"));
	    }

	@Test
	public  static WebDriver getDriver() throws IOException 
	{
		
		if (driver == null) {
			
		
	   String browserName = Utility.ReadProperties.FileRead("BROWSER");
	   if(browserName .equals("chrome"))
	   {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	   }
	   
	   else if (browserName.equalsIgnoreCase("firefox")) 
	   {
	        WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
	    } 
	   
	    else if (browserName.equalsIgnoreCase("edge")) 
	    {
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	    } 
	   
	    else
	    {
	        throw new RuntimeException("Browser not supported: " + browserName);
	    }
	   
	   driver.get(ReadProperties.FileRead("URL"));
	   driver.manage().window().maximize();
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
		return driver;
  }	   
}
