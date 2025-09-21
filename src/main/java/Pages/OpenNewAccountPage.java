package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class OpenNewAccountPage extends BasePage{

    public OpenNewAccountPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements

    private By AccountType = By.id("type");
    private By Checking = By.xpath("//option[@value='0' and text()='CHECKING']");
    private By Saving = By.xpath("//option[@value='1' and text()='SAVINGS']");
    private By OpenNewAccountBTN = By.xpath("//input[@type='button' and @class='button' and @value='Open New Account']");
    private By AccountOpened = By.xpath("//h1[@class='title' and text()='Account Opened!']");



    // Getter For All Elements

    public WebElement getAccountType() {return wait.until(ExpectedConditions.elementToBeClickable(AccountType));}

    public WebElement getChecking() {return wait.until(ExpectedConditions.elementToBeClickable(Checking));}

    public WebElement getSaving() {return wait.until(ExpectedConditions.elementToBeClickable(Saving));}

    public WebElement getOpenNewAccountBTN() {return wait.until(ExpectedConditions.elementToBeClickable(OpenNewAccountBTN));}
    public WebElement getAccountOpened() {return wait.until(ExpectedConditions.elementToBeClickable(AccountOpened));}


    // Click On All Elements
    public void ClickOnAccountType(){getAccountType().click();}
    public void ClickOnChecking(){getChecking().click();}
    public void ClickOnSaving(){getSaving().click();}
    public void ClickOnOpenNewAccountBTN(){getOpenNewAccountBTN().click();}

    // Validate that the Account Opened Successfully or not
    public Boolean AccountOpenedIsDisplayed(){return getAccountOpened().isDisplayed();}

}
