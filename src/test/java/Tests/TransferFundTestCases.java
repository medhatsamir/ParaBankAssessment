package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.TransferFundPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TransferFundTestCases extends BaseTest{



    @Test
    public void ValidTransferFund() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.Login("Test","Test@1234");
        TransferFundPage transferFundPage = homePage.ClickOnTransferFundsBTN();
        transferFundPage.SendValueToAmount("100");
        transferFundPage.getElementFromFromDropDownList("15009");
        transferFundPage.getElementFromTodropdown("14343");
        transferFundPage.ClickOnTransferBTN();
        Assert.assertTrue(transferFundPage.TransferCompleteIsDisplayed());
    }
}
