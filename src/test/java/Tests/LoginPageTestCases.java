package Tests;


import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class LoginPageTestCases extends BaseTest{



    @Test
    public void InvalidLogin() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("Wrong","Wrong");
        Assert.assertTrue(loginPage.InvalidLoginMessageIsDisplayed());
    }

    @Test
    public void ValidLogin() throws AWTException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.Login("Test","Test@1234");
        Assert.assertTrue(homePage.getLogOutBTN().isDisplayed());
    }
}
