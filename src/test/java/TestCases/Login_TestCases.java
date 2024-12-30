package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.MainClass;
import Pages.LoginOptions;
import Utility.ScreenShot;

public class Login_TestCases extends MainClass {

	LoginOptions login;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		Initialize();		
	  login=new LoginOptions();	
	}
	
	@Test
	public void LoginTest()
	{			 
	 String	ActURL="https://www.hdfcbank.com/";		 
	 login.MoveLogin();	
	 String	ExpURL= login.getCurrentUrl();	 
	 AssertJUnit.assertEquals(ActURL, ExpURL, "URLs do not match!");
	}
	
	 @AfterMethod 
     public void CloseConnection(ITestResult result) throws IOException 
     {
    	 if(result.FAILURE==result.getStatus())
    	 {
    		 ScreenShot.ScreenShotDetails(result.getName());
    	 }
//         report.flush();
        driver.close();
         }
   }
