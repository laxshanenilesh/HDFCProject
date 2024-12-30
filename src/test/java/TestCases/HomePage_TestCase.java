package TestCases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackage.MainClass;
import Pages.HomePage;
import Utility.ScreenShot;

public class HomePage_TestCase extends MainClass {

	 HomePage page;
	 
	       @BeforeMethod
		   public void setUp() throws IOException {
		    	Initialize();		    	
		         page = new HomePage(); // Initialize the HomePage object
		    }
	       
	       @Test(priority = 1)
	       public void verifyHomePageLoadsCorrectly() {
	           Assert.assertTrue(page.isBannerDisplayed(), "Banner is not displayed on the homepage.");
	           Assert.assertTrue(page.isNavigationMenuDisplayed(), "Navigation menu is not visible on the homepage.");
	           Assert.assertTrue(page.isFooterDisplayed(), "Footer is not displayed on the homepage.");
	       }

	       @Test(priority = 2)
	       public void verifyUrlUsesHTTPS() {
	           String currentUrl = page.getCurrentUrl();
	           Assert.assertTrue(currentUrl.startsWith("https://"), "URL does not start with HTTPS.");
	       }

	       @Test(priority = 3)
	       public void verifyLogoIsDisplayedAndClickable() {
	           Assert.assertTrue(page.isLogoDisplayed(), "Logo is not displayed on the homepage.");
	           page.clickOnLogo();
	           String ActURL = "https://www.hdfcbank.com/";
	           String currentUrl = page.getCurrentUrl();
	           Assert.assertEquals(currentUrl, ActURL, "Logo click did not redirect to the homepage.");
	       }
	       
		 @AfterMethod 
		public void CloseConnection(ITestResult result) throws IOException 
	 {
		 if(result.FAILURE==result.getStatus())
	 {
		 ScreenShot.ScreenShotDetails(result.getName());
	 }
		driver.close();
	}
 }
