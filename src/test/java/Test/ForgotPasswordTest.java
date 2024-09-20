package Test;

import Pages.ForgotPasswordPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.TestBase;
import org.testng.annotations.Test;

import static Utils.PageMethodConfiguration.waitInSeconds;

public class ForgotPasswordTest extends TestBase {

    private HomePage kariyerNetHomePage;
    private ForgotPasswordPage forgotPasswordPage;
    private LoginPage loginPage;


    @Test(priority = 1)
    public void VerifyHomePage() throws InterruptedException {

        kariyerNetHomePage = new HomePage(webDriver);
        waitInSeconds(5);

        kariyerNetHomePage.clickcoPilotButton();
        kariyerNetHomePage.clickMenuTab();
        kariyerNetHomePage.clickLoginButton();

        waitInSeconds(5);

        loginPage = new LoginPage(webDriver);

        loginPage.verifyGoogle();
        loginPage.verifyFacebook();
        loginPage.verifyApple();
        loginPage.verifyUsername();
        loginPage.verifyPassword();
        loginPage.clickForgotPassword();

        waitInSeconds(5);

        forgotPasswordPage = new ForgotPasswordPage(webDriver);

        waitInSeconds(5);

        forgotPasswordPage.verifyForgotPasswordText();
        forgotPasswordPage.verifyForgotPasswordHeader();
        forgotPasswordPage.verifyPostButton();
        forgotPasswordPage.verifyMobileButton();
        forgotPasswordPage.writeEmail();
        forgotPasswordPage.verifySubmitButton();
        forgotPasswordPage.verifyText();



    }

}
