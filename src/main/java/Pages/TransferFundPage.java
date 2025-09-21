package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class TransferFundPage extends BasePage{
    public TransferFundPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Elements
    private By Amount = By.id("amount");
    private By FromDropdownElement = By.id("fromAccountId");
    private By ToDropdownElement = By.id("toAccountId");
    private By TransferBTN = By.xpath("//input[@type='submit' and @class='button' and @value='Transfer']");
    private By TransferComplete = By.xpath("//h1[@class='title' and text()='Transfer Complete!']");




    // Getter For All Elements
    public WebElement getAmount() {return wait.until(ExpectedConditions.elementToBeClickable(Amount));}

    public WebElement getFromDropdownElement() {return wait.until(ExpectedConditions.elementToBeClickable(FromDropdownElement));}

    public WebElement getToDropdownElement() {return wait.until(ExpectedConditions.elementToBeClickable(ToDropdownElement));}
    public WebElement getTransferBTN() {return wait.until(ExpectedConditions.elementToBeClickable(TransferBTN));}
    public WebElement getTransferComplete() {return wait.until(ExpectedConditions.elementToBeClickable(TransferComplete));}




    // Send Keys To Elements
    public void SendValueToAmount(String Value){
        getAmount().sendKeys(Value);
    }


    // Click on the Elements
    public void ClickOnTransferBTN(){getTransferBTN().click();}

    Select Fromdropdown = new Select(getFromDropdownElement());
    Select Todropdown = new Select(getToDropdownElement());


    public void getElementFromFromDropDownList(String Value){Fromdropdown.selectByVisibleText(Value);}
    public void getElementFromTodropdown(String Value){Todropdown.selectByVisibleText(Value);}


    // Validate that the Transfer Done Successfully
    public Boolean TransferCompleteIsDisplayed(){return getTransferComplete().isDisplayed();}

}
