package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.*;
import java.util.List;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) throws AWTException {
        super(driver);
    }

    // Locators For All Element
    private By UserName = By.name("username");
    private By PassWord = By.name("password");
    private By LoginBTN = By.xpath("//input[@type='submit' and @class='button' and @value='Log In']");
    private By RegisterBTN = By.xpath("//a[translate(text(), 'REGISTER', 'register')='register']");
    private By InvalidLoginMessage = By.xpath("//p[@class='error' and text()='The username and password could not be verified.']");


    // Getters For All Elements
    public WebElement getUserName() {return wait.until(ExpectedConditions.elementToBeClickable(UserName));}
    public WebElement getPassWord() {return wait.until(ExpectedConditions.elementToBeClickable(PassWord));}
    public WebElement getLoginBTN() {return wait.until(ExpectedConditions.elementToBeClickable(LoginBTN));}
    public WebElement getRegisterBTN() {return wait.until(ExpectedConditions.elementToBeClickable(RegisterBTN));}
    public WebElement getInvalidLoginMessage() {return wait.until(ExpectedConditions.elementToBeClickable(InvalidLoginMessage));}


    // Clicks for All Elements
    public RegisterPage ClickOnRegisterBTN() throws AWTException {
        getRegisterBTN().click();
        return new RegisterPage(driver);
    }
    public void ClickOnUserName(){getUserName().click();}
    public void ClickOnPassWord(){getPassWord().click();}
    public HomePage ClickOnLoginBTN() throws AWTException {
        getLoginBTN().click();
        return new HomePage(driver);
    }


    // Send Keys For Elements
    public void SendValueToUserName(String Value){getUserName().sendKeys(Value);}
    public void SendValueToPassWord(String Value){getPassWord().sendKeys(Value);}


    // Validate that we still on the same Page
    public Boolean LoginBTNIsDisplayed(){return getLoginBTN().isDisplayed();}


    //Validate that the Login is failed
    public Boolean InvalidLoginMessageIsDisplayed(){return getInvalidLoginMessage().isDisplayed();}


    // Functions
    public HomePage Login(String UserName , String Password) throws AWTException {
        ClickOnUserName();
        SendValueToUserName(UserName);
        ClickOnPassWord();
        SendValueToPassWord(Password);
        return ClickOnLoginBTN();
    }



}

