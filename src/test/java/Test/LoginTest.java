package Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.TestBase;
import org.testng.annotations.Test;

import static Utils.PageMethodConfiguration.waitInSeconds;

public class LoginTest extends TestBase {

    private HomePage kariyerNetHomePage;
    private LoginPage loginPage;


    @Test(priority = 1)
    public void VerifyHomePage() throws InterruptedException {

        kariyerNetHomePage = new HomePage(webDriver);

        waitInSeconds(3);

        kariyerNetHomePage.verifySearchJobSection();
        kariyerNetHomePage.verifyJobBoxTitle();
        kariyerNetHomePage.verifyAdvertisingPackage();
        kariyerNetHomePage.verifyFindJobSection();
        kariyerNetHomePage.verifyCareerPlanning();
        kariyerNetHomePage.verifyCareerGuide();
        kariyerNetHomePage.clickcoPilotButton();
        kariyerNetHomePage.clickMenuTab();
        kariyerNetHomePage.clickLoginButton();

        waitInSeconds(3);

        loginPage = new LoginPage(webDriver);

        loginPage.verifyGoogle();
        loginPage.verifyFacebook();
        loginPage.verifyApple();
        loginPage.writeUserName();
        loginPage.writePassword();
        loginPage.verifyRememberIcon();
        loginPage.verifyForgotPassLink();
        loginPage.verifyRegisterLink();
        loginPage.verifyPublisherLink();
        loginPage.clickLogin();


    }

}