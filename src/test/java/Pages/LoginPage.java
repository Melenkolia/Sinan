package Pages;

import Utils.PageMethodConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageMethodConfiguration {

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public final String googleButton = "//span[normalize-space()='Google']";
    public final String facebookButton = "//button[@id='facebookButton']";
    public final String appleButton = "//span[normalize-space()='Apple']";
    public final String username = "//input[@id='username']";
    public final String password = "//input[@id='pass']";
    public final String rememberIcon = "//label[@for='rememberMe']";
    public final String forgotPass = "//a[@id='forgottenPassLink']";
    public final String loginButton = "//button[@class='kds-action-button kds-primary kds-medium kds-purple kds-rounded-medium kds-font-medium kds-full-width']//span[contains(text(),'Giriş Yap')]";
    public final String registerLink = "//a[@id='registerLink']";
    public final String publisherLink = "//a[@id='publisherLink']";

    public void verifyGoogle(){ isDisplayed(By.xpath(googleButton)); }
    public void verifyFacebook(){ isDisplayed(By.xpath(facebookButton)); }
    public void verifyApple(){ isDisplayed(By.xpath(appleButton)); }
    public void verifyUsername(){ isDisplayed(By.xpath(username)); }
    public void verifyPassword(){ isDisplayed(By.xpath(password)); }
    public void writeUserName(){ writeText(By.xpath(username), generateRandomGmail()); }
    public void writePassword(){ writeText(By.xpath(password), generateRandomPassword()); }
    public void verifyRememberIcon(){ isDisplayed(By.xpath(rememberIcon)); }
    public void verifyForgotPassLink(){ isDisplayed(By.xpath(forgotPass)); }
    public void verifyRegisterLink(){ isDisplayed(By.xpath(registerLink)); }
    public void verifyPublisherLink(){ isDisplayed(By.xpath(publisherLink)); }
    public void clickLogin(){ clickElement(By.xpath(loginButton)); }
    public void clickForgotPassword(){clickElement(By.xpath(forgotPass)); }

}
