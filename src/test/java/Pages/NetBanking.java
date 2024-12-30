package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.MainClass;
import Utility.ReadProperties;

public class NetBanking extends MainClass {
	  
	   @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[11]/div[3]/div/div/div/div/div/div[1]/div/div[1]/a")private WebElement netbanking;
	   @FindBy(xpath = "//input[@type='text']")private WebElement UserId;
	  
	   public NetBanking()
	   {
		 PageFactory.initElements(driver, this);
	   }
	   
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	   
	  public void clickNetBankingLink()
	{
		  wait.until(ExpectedConditions.elementToBeClickable(netbanking)).click();
		//  return driver.getCurrentUrl();
	}
	  public void enterUserId() throws IOException
	  {
		  clickNetBankingLink();
		  wait.until(ExpectedConditions.visibilityOf(UserId)); // Ensure textbox is visible
	        String userIdValue = ReadProperties.FileRead("UserID");
	        UserId.sendKeys(userIdValue);
	        
	        
	        
//		   String UserData=  ReadProperties.FileRead("UserID").trim();
//		  UserId.sendKeys(UserData);
//		  return driver.getCurrentUrl();
	  }
}
