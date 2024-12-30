package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.MainClass;

public class MyAccount_Page extends MainClass {
	
	@FindBy(xpath=("//span[text()='My Account']")) private WebElement MyAccount;
	

     public  MyAccount_Page()
    {
    PageFactory.initElements(driver, this);		 
	}
	
    public String MyAccount()
    {
	   MyAccount.click();
       return MyAccount.getText();	
    }
    
   public String CurrentUrl()
   {
	 return driver.getCurrentUrl();
	 
   }
	


}
