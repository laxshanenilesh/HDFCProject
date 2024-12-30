package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.MainClass;

public class HomePage extends MainClass {

	    @FindBy(css = "img.img-fluid.img-desktop") private WebElement banner;              // Example XPath for the banner	 
	    @FindBy(xpath = "//*[@id=\"footer-accordion\"]/div/div/div")private WebElement navigationMenu;                             	    
	    @FindBy(xpath = "//footer[@id=\"footer-accordion\"]")private WebElement footer;                              // Example XPath for the footer
	    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/header/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[1]/div[1]/a[1]/span")private WebElement logo;                 // Example XPath for the logo
	    

	    // Methods to perform actions
	     public HomePage()
	     {
	    	PageFactory.initElements(driver, this); 
	     }
	    
	    public boolean isBannerDisplayed() {
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	         WebElement banner = wait.until(ExpectedConditions.visibilityOf(this.banner)); 
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].scrollIntoView(true);", banner);
	         return banner.isDisplayed();
	       // return banner.isDisplayed();
	    }

	    // Check if navigation menu is displayed
	    public boolean isNavigationMenuDisplayed() {
	        return navigationMenu.isDisplayed();
//	    public String isNavigationMenuDisplayed() {
//	        navigationMenu.isDisplayed();
//	        return driver.getCurrentUrl();
	    }
      
	    public boolean isFooterDisplayed() {
	        return footer.isDisplayed();                                                 // Check if footer is displayed
//	    public String isFooterDisplayed() {
//	        footer.isDisplayed();
//	        return driver.getCurrentUrl();
	    }
	    
	    public boolean isLogoDisplayed() {
	        return logo.isDisplayed();

	    }                                                       // Click on the logo
	    public void clickOnLogo() {
	        logo.click();
	    }

	                                                             // Get the current URL
	    public String getCurrentUrl() {
	        return driver.getCurrentUrl();
	    }
	}

