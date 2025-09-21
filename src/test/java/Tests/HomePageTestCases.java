package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class HomePageTestCases extends BaseTest{

    @Test
    public void LogOutTestCase() throws AWTException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.Login("Test","Test@1234");
        LoginPage loginPageAfterLogout = homePage.ClickOnLogOutBTN();
        Assert.assertTrue(loginPageAfterLogout.LoginBTNIsDisplayed());
    }
}
