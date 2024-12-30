package Pages;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.MainClass;

public class LoginOptions extends MainClass{
	
	@FindBy(xpath = "//*[@id=\"custom-button\"]/div/div/div/button") private WebElement Login;
	  
	  public LoginOptions()
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void MoveLogin()
	  {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.visibilityOf(Login));
	        
		 Actions action=new Actions(driver); 
		 action.moveToElement(Login).perform();		  
	  }
	  public String getCurrentUrl() {
	        return driver.getCurrentUrl(); // Return current URL after the login click
	    }
	}
     

