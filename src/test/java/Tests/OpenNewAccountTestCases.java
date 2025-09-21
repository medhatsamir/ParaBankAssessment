package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.OpenNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class OpenNewAccountTestCases extends BaseTest{



    @Test
    public void OpenNewAccountTestCase() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.Login("Test","Test@1234");
        OpenNewAccountPage openNewAccountPage = homePage.ClickOnOpenNewAccountBTN();
        openNewAccountPage.ClickOnAccountType();
        openNewAccountPage.ClickOnSaving();
        openNewAccountPage.ClickOnOpenNewAccountBTN();
        Assert.assertTrue(openNewAccountPage.AccountOpenedIsDisplayed() );
    }
}
