package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UpdateContactInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class UpdateContactInfoTestCases extends BaseTest{


    @Test
    public void UpdateAllContactInfo() throws AWTException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.Login("Test","Test@1234");
        UpdateContactInfoPage updateContactInfoPage = homePage.ClickOnUpdateContactInfoBTN();
        updateContactInfoPage.ClearAddress();
        updateContactInfoPage.SendValueToAddress("new");
        updateContactInfoPage.ClearCity();
        updateContactInfoPage.SendValueToCity("new");
        updateContactInfoPage.ClearFirstName();
        updateContactInfoPage.SendValueToFirstName("new");
        updateContactInfoPage.ClearLastName();
        updateContactInfoPage.SendValueToLastName("new");
        updateContactInfoPage.ClearState();
        updateContactInfoPage.SendValueToState("new");
        updateContactInfoPage.ClearPhoneNum();
        updateContactInfoPage.SendValueToPhoneNum("new");
        updateContactInfoPage.ClearZipCode();
        updateContactInfoPage.SendValueToZipCode("new");
        updateContactInfoPage.ClickOnUpdateProfileBTN();
        Assert.assertTrue(updateContactInfoPage.ProfileUpdatedDisplayed());
    }
}
