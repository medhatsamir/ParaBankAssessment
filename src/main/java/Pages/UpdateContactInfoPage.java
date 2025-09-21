package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class UpdateContactInfoPage extends BasePage{
    public UpdateContactInfoPage(WebDriver driver) throws AWTException {
        super(driver);
    }


    // Locators For All Element

    private By FirstName = By.name("customer.firstName");
    private By LastName = By.name("customer.lastName");
    private By Address = By.name("customer.address.street");
    private By City = By.name("customer.address.city");
    private By State = By.name("customer.address.state");
    private By ZipCode = By.name("customer.address.zipCode");
    private By PhoneNum = By.name("customer.phoneNumber");
    private By SSN = By.name("customer.ssn");
    private By UpdateProfileBTN = By.xpath("//input[@type='button' and @class='button' and @value='Update Profile']");
    private By ProfileUpdated = By.xpath("//h1[@class='title' and text()='Profile Updated']");




    // Errors
    private By FirstNameError = By.id("customer.firstName.errors");
    private By LastNameError = By.id("customer.lastName.errors");
    private By AddressError = By.id("customer.address.street.errors");
    private By CityError = By.id("customer.address.city.errors");
    private By StateError = By.id("customer.address.state.errors");
    private By ZipCodeError = By.id("customer.address.zipCode.errors");
    private By PhoneNumError = By.id("customer.phoneNumber.errors");
    private By SSNError = By.id("customer.phoneNumber.errors");


    // Getters For All Elements

    public WebElement getFirstName() {return wait.until(ExpectedConditions.elementToBeClickable(FirstName));}

    public WebElement getLastName() {return wait.until(ExpectedConditions.elementToBeClickable(LastName));}

    public WebElement getAddress() {return wait.until(ExpectedConditions.elementToBeClickable(Address));}

    public WebElement getCity() {return wait.until(ExpectedConditions.elementToBeClickable(City));}

    public WebElement getState() {return wait.until(ExpectedConditions.elementToBeClickable(State));}

    public WebElement getZipCode() {return wait.until(ExpectedConditions.elementToBeClickable(ZipCode));}

    public WebElement getPhoneNum() {return wait.until(ExpectedConditions.elementToBeClickable(PhoneNum));}

    public WebElement getSSN() {return wait.until(ExpectedConditions.elementToBeClickable(SSN));}


    public WebElement getFirstNameError() {return wait.until(ExpectedConditions.elementToBeClickable(FirstNameError));}
    public WebElement getLastNameError() {return wait.until(ExpectedConditions.elementToBeClickable(LastNameError));}
    public WebElement getAddressError() {return wait.until(ExpectedConditions.elementToBeClickable(AddressError));}
    public WebElement getCityError() {return wait.until(ExpectedConditions.elementToBeClickable(CityError));}
    public WebElement getStateError() {return wait.until(ExpectedConditions.elementToBeClickable(StateError));}
    public WebElement getZipCodeError() {return wait.until(ExpectedConditions.elementToBeClickable(ZipCodeError));}
    public WebElement getPhoneNumError() {return wait.until(ExpectedConditions.elementToBeClickable(PhoneNumError));}
    public WebElement getSSNError() {return wait.until(ExpectedConditions.elementToBeClickable(SSNError));}
    public WebElement getUpdateProfileBTN() {return wait.until(ExpectedConditions.elementToBeClickable(UpdateProfileBTN));}
    public WebElement getProfileUpdated() {return wait.until(ExpectedConditions.elementToBeClickable(ProfileUpdated));}



    // Click on Elements

    public void ClickOnFirstName(){getFirstName().click();}
    public void ClickOnLastName(){getLastName().click();}
    public void ClickOnAddress(){getAddress().click();}
    public void ClickOnCity(){getCity().click();}
    public void ClickOnState(){getState().click();}
    public void ClickOnZipCode(){getZipCode().click();}
    public void ClickOnPhoneNum(){getPhoneNum().click();}
    public void ClickOnSSN(){getSSN().click();}
    public void ClickOnUpdateProfileBTN(){getUpdateProfileBTN().click();}


    // Send Keys to Elements
    public void SendValueToFirstName(String Value){getFirstName().sendKeys(Value);}
    public void SendValueToLastName(String Value){getLastName().sendKeys(Value);}
    public void SendValueToAddress(String Value){getAddress().sendKeys(Value);}
    public void SendValueToCity(String Value){getCity().sendKeys(Value);}
    public void SendValueToState(String Value){getState().sendKeys(Value);}
    public void SendValueToZipCode(String Value){getZipCode().sendKeys(Value);}
    public void SendValueToPhoneNum(String Value){getPhoneNum().sendKeys(Value);}
    public void SendValueToSSN(String Value){getSSN().sendKeys(Value);}


    // Validate that the Element are Displayed

    public Boolean FirstnameErrorDisplayed(){return getFirstNameError().isDisplayed();}
    public Boolean LastnameErrorDisplayed(){return getLastNameError().isDisplayed();}
    public Boolean AddressErrorDisplayed(){return getAddressError().isDisplayed();}
    public Boolean CityErrorDisplayed(){return getCityError().isDisplayed();}
    public Boolean StateErrorDisplayed(){return getStateError().isDisplayed();}
    public Boolean ZipCodeErrorDisplayed(){return getZipCodeError().isDisplayed();}
    public Boolean PhoneNumErrorDisplayed(){return getPhoneNumError().isDisplayed();}
    public Boolean SSNErrorDisplayed(){return getSSNError().isDisplayed();}
    public Boolean ProfileUpdatedDisplayed(){return getProfileUpdated().isDisplayed();}



    // Clear Value From Elements
        public void ClearFirstName(){getFirstName().clear();}
        public void ClearLastName(){getLastName().clear();}
        public void ClearAddress(){getAddress().clear();}
        public void ClearCity(){getCity().clear();}
        public void ClearState(){getState().clear();}
        public void ClearZipCode(){getZipCode().clear();}
        public void ClearPhoneNum(){getPhoneNum().clear();}
}
