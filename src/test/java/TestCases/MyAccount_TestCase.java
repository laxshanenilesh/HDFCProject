package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BasePackage.MainClass;
import Pages.MyAccount_Page;
import Utility.ScreenShot;

public class MyAccount_TestCase extends MainClass {
   
	 MyAccount_Page acount;
	 
	public void setup() throws IOException
	{
      Initialize();	
       acount=new MyAccount_Page();
	}
	
	@Test
	public void  MyAccount_Page()
	{
		String ActUrl="https://demo.opencart.com/";
		String ExpUrl=acount.CurrentUrl();		
		AssertJUnit.assertEquals(ActUrl, ExpUrl);
		Reporter.log("My Account Page_URL Is Correct: "+ ActUrl);
		System.out.println("This Is MyCurrent Account URL :"+ driver.getCurrentUrl());				
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
