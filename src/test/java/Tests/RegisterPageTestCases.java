package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class RegisterPageTestCases extends BaseTest{


    @Test(priority = 3)
    public void ValidRegister() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = loginPage.ClickOnRegisterBTN();
        HomePage homePage = registerPage.RegisterWithFullData("Test","Test","Test","Test","Test","Test","Test","Test","Test","Test@1234","Test@1234");
        Assert.assertTrue(homePage.AccountCreatedSuccessfullyIsDisplayed());
    }
    @Test(priority = 1)
    public void InValidRegisterWithoutFirstname() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = loginPage.ClickOnRegisterBTN();
        HomePage homePage = registerPage.RegisterWithFullData("","Test","Test","Test","Test","Test","Test","Test","Test","Test@1234","Test@1234");
        Assert.assertTrue(registerPage.getFirstNameError().isDisplayed());
    }
    @Test(priority = 2)
    public void InValidRegisterWithoutFirstnameAndLastName() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = loginPage.ClickOnRegisterBTN();
        HomePage homePage = registerPage.RegisterWithFullData("","","Test","Test","Test","Test","Test","Test","Test","Test@1234","Test@1234");
        Assert.assertTrue(registerPage.getFirstNameError().isDisplayed());
        Assert.assertTrue(registerPage.getLastNameError().isDisplayed());
    }

}
