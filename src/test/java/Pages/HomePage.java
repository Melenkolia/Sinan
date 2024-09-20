package Pages;

import Utils.PageMethodConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageMethodConfiguration {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public final String menuButton = "//span[contains(text(),'Giriş Yap / Üye Ol')]";
    public final String headerLoginButton = "//a[@class='header-user-items-menu-button empty-button login-button']";
    public final String cookiesID = "30692fdd-35e2-45f3-b5d8-155663ed9a1b";
    public final String coPilot = "//img[@class='kp-close-button']";
    public final String kNetLogoHeader = "//div[@class='mobile-header-left d-lg-none']//a";
    public final String advertisingPackageButton = "//span[@data-test='title'][contains(text(),'İlan Paketi Al')]";
    public final String searchJobButton = "//span[contains(text(),'İş Ara')]";
    public final String careerPlanningButton= "//span[@data-test='title'][contains(text(),'Kariyer Planlaması')]";
    public final String careerGuideButton= "//span[@data-test='title'][normalize-space()='Kariyer Rehberi']";
    public final String findJobButton = "//span[contains(text(),'İŞ BUL')]";
    public final String jobBoxTitle = "//*[contains(text(),'Kariyer Fırsatlarını')]";

    public void verifyCookies(){ isDisplayed(By.id(cookiesID)); }
    public void closeCookiesTab(){ clickElement(By.id(cookiesID)); }
    public void verifySearchJobSection(){ isDisplayed(By.xpath(searchJobButton)); }
    public void verifyJobBoxTitle(){ isDisplayed(By.xpath(jobBoxTitle)); }
    public void verifyFindJobSection(){ isDisplayed(By.xpath(findJobButton)); }
    public void verifyAdvertisingPackage(){ isDisplayed(By.xpath(advertisingPackageButton)); }
    public void verifyCareerPlanning(){ isDisplayed(By.xpath(careerPlanningButton)); }
    public void verifyCareerGuide(){ isDisplayed(By.xpath(careerGuideButton)); }
    public void clickMenuTab(){ click(By.xpath(menuButton)); }
    public void clickLoginButton() {click(By.xpath(headerLoginButton)); }
    public void clickcoPilotButton () {click(By.xpath(coPilot));}
}


//    public void verifyUserNameText(){ isDisplayed(By.xpath(kNetLogoHeader)); }
//    public void clickUserNameText(){ click(By.xpath(kNetLogoHeader)); }
//    public void verifyMenuTab(){ isDisplayed(By.xpath(menuButton)); }
//    public void clickMenuTab(){ click(By.xpath(menuButton)); }


//    public void verifyPasswordText(){ isDisplayed(By.xpath(kNetLogoHeader)); }
//    public void verifyRememberIcon(){ isDisplayed(By.xpath(rememberIconLocalator)); }
//    public void verifyForgetPasswordText(){ isDisplayed(By.xpath(forgetPassowordTextLocalator)); }
//    public void userName(){ writeText(By.xpath(userNameLocalator),"cryptaway@procenne.com"); }
//    public void password(){ writeText(By.xpath(passwordLocalator),"Cryptokolik2021!"); }
//    public void clickLoginButton(){ click(By.xpath(loginButtonLocalator)); }


