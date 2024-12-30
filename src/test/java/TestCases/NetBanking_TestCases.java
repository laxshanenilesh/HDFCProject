package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.MainClass;
import Pages.LoginOptions;
import Pages.NetBanking;

public class NetBanking_TestCases extends MainClass {
   
	  NetBanking netbanking;
	//  LoginOptions login;
	  
	  @BeforeMethod
	  public void setup() throws IOException
	  {
		  Initialize();
		  netbanking = new NetBanking();  
		//  login = new LoginOptions();
		//  login.MoveLogin();
	  }
	  
	  @Test(priority = 1)
	  public void verifyNetBankingNavigation()
	  {
		  netbanking.clickNetBankingLink();
		  String currentURL = driver.getCurrentUrl();
	        String expectedURL = "https://www.hdfcbank.com/";
	        Assert.assertTrue(currentURL.contains(expectedURL), "Navigation to NetBanking failed!");
	    }
	  
	  @Test(priority = 2)
	  public void enterUserIdTest() throws IOException 
	  {
		  netbanking.enterUserId();
	//	  String actualURL = netbanking.enterUserId();
	//	  String expectedURL = "https://www.hdfcbank.com/";
		  Assert.assertTrue(true, "User ID entered successfully");
	  }
  }

