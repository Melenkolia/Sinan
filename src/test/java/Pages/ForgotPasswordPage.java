package Pages;

import Utils.PageMethodConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends PageMethodConfiguration {

    public ForgotPasswordPage(WebDriver webDriver) {super(webDriver); }

    public final String forgotPasswordText = "//p[contains(text(), 'Şifre sıfırlama bağlantısını gönderebilmemiz için kullanıcı adını veya e-posta adresini girmelisin.')]";
    public final String forgotPasswordHeader = "//h1[contains(text(), 'Şifremi Unuttum')]";
    public final String postButton = "//span[normalize-space()='E-Posta']";
    public final String mobileButton = "//span[normalize-space()='Telefon']";
    public final String email = "//input[@id='email']";
    public final String submitButton = "//button[@class='submit-button']";
    public final String bizeUlasText = "//a[contains(text(),'Bize ulaş')]";


    public void verifyForgotPasswordText(){ isDisplayed(By.xpath(forgotPasswordText)); }
    public void verifyForgotPasswordHeader(){ isDisplayed(By.xpath(forgotPasswordHeader)); }
    public void verifyPostButton(){ isDisplayed(By.xpath(postButton)); }
    public void verifyMobileButton(){ isDisplayed(By.xpath(mobileButton)); }
    public void writeEmail(){ writeText(By.xpath(email), generateRandomGmail()); }
    public void verifySubmitButton(){ isDisplayed(By.xpath(submitButton)); }
    public void verifyText(){ isDisplayed(By.xpath(bizeUlasText)); }


}
