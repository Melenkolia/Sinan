package Pages;

import TestCase_Assertions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageMethodConfiguration{

    Assertions assertions = new Assertions();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public final String IMDb_LogoLocalator = "home_img_holder";
    public final String menuIconLocalator = ".ipc-icon--menu";
    public final String singInLocalator = "//div[@class='nav__userMenu navbar__user sc-hhIjBB efwKJG']/a[1]/span[@class='ipc-btn__text']";
    public final String useAppLocalator = "//span[.='Use app']";
    public final String acceptCookieslocalator = "//button[@class='icb-btn sc-bcXHqe sc-dkrFOg sc-iBYQkv dcvrLS ddtuHe dRCGjd']";
    public final String searchBoxLocalator = "suggestion-search";
    public final String searchElementLocalator = "//div[@id='react-autowhatever-navSuggestionSearch']/div[1]";
    public final String suggestionContainerLocalator = "//div[@id='react-autowhatever-navSuggestionSearch']";
    public final String pageContentContainerLocalator = ".sc-af4251f0-0";



    public void verifyHomePage_IMDbHeader(){ isDisplayed(By.id(IMDb_LogoLocalator)); }
    public void verifyHomePage_MenuIcon(){ isDisplayed(By.cssSelector(menuIconLocalator)); }
    public void verifyHomePage_SıgnInIcon(){ isDisplayed(By.xpath(singInLocalator)); }
    public void verifyHomePage_UseAppIcon(){ isDisplayed(By.xpath(useAppLocalator)); }
    public void verifyHomePage_ContentContainer(){ isDisplayed(By.cssSelector(pageContentContainerLocalator)); }
    public void verifyHomePage_SearchSuggestionContainer(){ isDisplayed(By.xpath(suggestionContainerLocalator)); }

    public void acceptCookies(){ click(By.xpath(acceptCookieslocalator)); }
    public void searchMovie() {search(By.id(searchBoxLocalator),"John Wick 3: Parabellum");}

    public void selectSearchSuggestion() { click(By.xpath(searchElementLocalator)); }




}
