package TestCases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import BasePackage.MainClass;
import Pages.LoanPage;


public class LoansTestCases extends MainClass{
            HomePage_TestCase page;      
	private LoanPage loanPage;

	@BeforeMethod
    public void setUp() throws Exception {
        Initialize();  // Initialize WebDriver and open the browser
        loanPage = new LoanPage(); // Create an object of LoanPage class
    }

    @Test(priority = 1)
    public void verifyHoverOverBorrowMenu() {
        // Hover over the "Borrow" menu
        loanPage.hoverOverBorrowMenu();
        
        // Verify that the submenu for Borrow is displayed
        Assert.assertTrue(loanPage.isLoansSubMenuDisplayed());
    }

    @Test(priority = 2)
    public void verifyClickOnPersonalLoan() {
        // Hover over and click the "Personal Loan" link
        loanPage.hoverOverBorrowMenu();
        loanPage.clickPersonalLoan();
        
        // Verify if the user is redirected to the Personal Loan page
        String expectedUrl = "https://www.hdfcbank.com/personal/borrow/popular-loans/personal-loan";  // Replace with the actual URL of the Personal Loan page
        String actualUrl = loanPage.getCurrentUrl();
        
        Assert.assertEquals(actualUrl, expectedUrl, "User is not redirected to the Personal Loan page.");
    }

    @Test(priority = 3)
    public void verifyClickOnHomeLoan() {
        // Hover over and click the "Home Loan" link
        loanPage.hoverOverBorrowMenu();
        loanPage.clickHomeLoan();
        
        String expectedUrl = "https://www.hdfc.com/housing-loans/home-loans?utm_campaign=HDFC_Bank&utm_medium=personal-popular-home-loan";  // Replace with the actual URL of the Home Loan page
        String actualUrl = loanPage.getCurrentUrl();
        
        Assert.assertEquals(actualUrl, expectedUrl, "User is not redirected to the Home Loan page.");
    }

    @Test(priority = 4)
    public void verifyClickOnCarLoan() {
        // Hover over and click the "Car Loan" link
        loanPage.hoverOverBorrowMenu();
        loanPage.clickCarLoan();
        
        // Verify if the user is redirected to the Car Loan page
        String expectedUrl = "https://www.hdfcbank.com/personal/borrow/popular-loans/new-car-loan";  // Replace with the actual URL of the Car Loan page
        String actualUrl = loanPage.getCurrentUrl();
        
        Assert.assertEquals(actualUrl, expectedUrl, "User is not redirected to the Car Loan page.");
    }

    @Test(priority = 5)
     public void verifyClickOnEducationLoan() {
        // Hover over and click the "Education Loan" link
        loanPage.hoverOverBorrowMenu();
        loanPage.clickEducationLoan();
  
        String actualUrl  = driver.getCurrentUrl();
        String expectedUrl = "https://www.hdfcbank.com/personal/borrow/popular-loans#/educational-loans";
       
        Assert.assertEquals(actualUrl,  expectedUrl, "User is not redirected to the Education Loan page.");
        System.out.println("Actual URL:" + actualUrl);
    }
      
   
    
    @Test(priority = 6)
    public void verifyClickOnGoldLoan() {
        // Hover over and click the "Gold Loan" link
        loanPage.hoverOverBorrowMenu();
        loanPage.clickGoldLoan();
        
        // Verify if the user is redirected to the Gold Loan page
        String expectedUrl = "https://www.hdfcbank.com/personal/borrow/loan-against-assets/gold-loan";  // Replace with the actual URL of the Gold Loan page
        String actualUrl = loanPage.getCurrentUrl();
        
        Assert.assertEquals(actualUrl, expectedUrl, "User is not redirected to the Gold Loan page.");
    }

    @Test(priority = 7)
    public void verifyClickOnBusinessLoan() {
        // Hover over and click the "Business Loan" link
        loanPage.hoverOverBorrowMenu();
        loanPage.clickBusinessLoan();
        
        // Verify if the user is redirected to the Business Loan page
        String expectedUrl = "https://www.hdfcbank.com/personal/borrow/popular-loans/business-loan";  // Replace with the actual URL of the Business Loan page
        String actualUrl = loanPage.getCurrentUrl();        
        Assert.assertEquals(actualUrl, expectedUrl, "User is not redirected to the Business Loan page.");
    }
//    @AfterMethod 
//    public void CloseConnection(ITestResult result) throws IOException 
//    {
//   	 if(result.FAILURE==result.getStatus())
//   	 {
//   		 ScreenShot.ScreenShotDetails(result.getName());
//   	 }
////        report.flush();
//       driver.close();
//        }
    }



