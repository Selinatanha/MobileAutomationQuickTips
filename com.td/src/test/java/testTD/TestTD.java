package testTD;

import TD.HomePage;
import TD.LoginPage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTD extends MobileAPI {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(ad, HomePage.class);
        loginPage = PageFactory.initElements(ad, LoginPage.class);
    }


   // @Test
    public void uiTestCases() {
        homePage.UIvalidations();
    }

    @Test
    public void forgotPassFunctionality() {
        homePage.clickOnAccountt();
        loginPage.clickForgotPass();
    }

   // @Test
    public void swipe() {
        homePage.swipeDown();
    }

    @Test
    public void checkAccountBalance() {
        homePage.clickOnAccountt();
    loginPage.fillUsernamePass();


    }
}
