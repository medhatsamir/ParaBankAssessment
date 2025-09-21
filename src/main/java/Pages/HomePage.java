package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) throws AWTException {
        super(driver);
    }


    // Locators For All Elements

    private By OpenNewAccountBTN = By.xpath("//a[@href='openaccount.htm' and text()='Open New Account']");
    private By AccountsOverviewBTN = By.xpath("//a[@href='overview.htm' and text()='Accounts Overview']");
    private By TransferFundsBTN = By.xpath("//a[@href='transfer.htm' and text()='Transfer Funds']");
    private By BillPayBTN = By.xpath("//a[@href='billpay.htm' and text()='Bill Pay']");
    private By FindTransactionsBTN = By.xpath("//a[@href='findtrans.htm' and text()='Find Transactions']");
    private By UpdateContactInfoBTN = By.xpath("//a[@href='updateprofile.htm' and text()='Update Contact Info']");
    private By RequestLoanBTN = By.xpath("//a[@href='requestloan.htm' and text()='Request Loan']");
    private By LogOutBTN = By.xpath("//a[@href='logout.htm' and text()='Log Out']");
    private By AccountCreatedSuccessfully = By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");




    // Getter For All Elements


    public WebElement getOpenNewAccountBTN() {return wait.until(ExpectedConditions.elementToBeClickable(OpenNewAccountBTN));}

    public WebElement getAccountsOverviewBTN() {return wait.until(ExpectedConditions.elementToBeClickable(AccountsOverviewBTN));}

    public WebElement getTransferFundsBTN() {return wait.until(ExpectedConditions.elementToBeClickable(TransferFundsBTN));}

    public WebElement getBillPayBTN() {return wait.until(ExpectedConditions.elementToBeClickable(BillPayBTN));}

    public WebElement getFindTransactionsBTN() {return wait.until(ExpectedConditions.elementToBeClickable(FindTransactionsBTN));}

    public WebElement getUpdateContactInfoBTN() {return wait.until(ExpectedConditions.elementToBeClickable(UpdateContactInfoBTN));}

    public WebElement getRequestLoanBTN() {return wait.until(ExpectedConditions.elementToBeClickable(RequestLoanBTN));}

    public WebElement getLogOutBTN() {return wait.until(ExpectedConditions.elementToBeClickable(LogOutBTN));}
    public WebElement getAccountCreatedSuccessfully() {return wait.until(ExpectedConditions.elementToBeClickable(AccountCreatedSuccessfully));}



    // Click On All Elements
    public OpenNewAccountPage ClickOnOpenNewAccountBTN() throws AWTException {
        getOpenNewAccountBTN().click();
        return new OpenNewAccountPage(driver);
    }
    public void ClickOnAccountsOverviewBTN(){getAccountsOverviewBTN().click();}
    public TransferFundPage ClickOnTransferFundsBTN() throws AWTException {
        getTransferFundsBTN().click();
        return new TransferFundPage(driver);
    }
    public void ClickOnBillPayBTN(){getBillPayBTN().click();}
    public void ClickOnFindTransactionsBTN(){getFindTransactionsBTN().click();}
    public UpdateContactInfoPage ClickOnUpdateContactInfoBTN() throws AWTException {
        getUpdateContactInfoBTN().click();
        return new UpdateContactInfoPage(driver);
    }
    public void ClickOnRequestLoanBTN(){getRequestLoanBTN().click();}
    public LoginPage ClickOnLogOutBTN() throws AWTException {
        getLogOutBTN().click();
        return new LoginPage(driver);
    }

    // Validate that the account Created Successfully
    public Boolean AccountCreatedSuccessfullyIsDisplayed(){return getAccountCreatedSuccessfully().isDisplayed();}

}
