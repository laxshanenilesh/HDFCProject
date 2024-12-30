package Pages;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import BasePackage.MainClass;

public class LoanPage extends MainClass {

	@FindBy(xpath = "//li[@id=\"webBorrow\"]") private WebElement borrowMenu;
    @FindBy(xpath = "//*[@id=\"webBorrow\"]/ul/li[1]/ul/li[2]/a/span") private WebElement personalLoanLink;
    @FindBy(xpath = "//*[@id=\"webBorrow\"]/ul/li[1]/ul/li[4]/a/span") private WebElement homeLoanLink;
    @FindBy(xpath = "//*[@id=\"webBorrow\"]/ul/li[1]/ul/li[7]/a/span") private WebElement carLoanLink;
    @FindBy(xpath = "//*[@id=\"webBorrow\"]/ul/li[1]/ul/li[12]/a/span")private WebElement educationLoanLink;
    @FindBy(xpath = "//*[@id=\"webBorrow\"]/ul/li[2]/ul/li[4]/a/span") private WebElement goldLoanLink;
    @FindBy(xpath = "//*[@id=\"webBorrow\"]/ul/li[1]/ul/li[5]/a/span") private WebElement businessLoanLink;

    // Constructor
    public LoanPage() {
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    // Hover over "Borrow" section (this method can be removed if not needed)
    public void hoverOverBorrowMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(borrowMenu).build().perform();
    }

    // Click on each loan option and verify the redirection
    public void clickPersonalLoan() {
     wait.until(ExpectedConditions.visibilityOf(personalLoanLink)).click();; 
        
    }

    public void clickHomeLoan() {
        wait.until(ExpectedConditions.visibilityOf(homeLoanLink)).click();
    }

    public void clickCarLoan() {
        wait.until(ExpectedConditions.visibilityOf(carLoanLink)).click();
    }

    public void clickEducationLoan() {
        wait.until(ExpectedConditions.visibilityOf(educationLoanLink)).click();
    }

    public void clickGoldLoan() {
        wait.until(ExpectedConditions.visibilityOf(goldLoanLink)).click();
    }

    public void clickBusinessLoan() {
        wait.until(ExpectedConditions.visibilityOf(businessLoanLink)).click();
    }

    // Get the current URL to verify redirection
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // Verify if the Borrow Menu is displayed
    public boolean isLoansSubMenuDisplayed() {
        return borrowMenu.isDisplayed();
    }
}