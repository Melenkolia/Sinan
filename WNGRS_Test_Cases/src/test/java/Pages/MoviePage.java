package Pages;

import TestCase_Assertions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage extends PageMethodConfiguration{

    Assertions assertions = new Assertions();

    public MoviePage(WebDriver driver) {
        super(driver);
    }
    public final String movieHeaderLocalator = "//span[@class='hero__primary-text']";
    public final String shareLocalator= ".ipc-icon--share";
    public final String allTopicLocalator = "//span[.='All topics']";
    public final String moviePosterLocalator = "//div[@class='ipc-poster ipc-poster--baseAlt ipc-poster--dynamic-width ipc-sub-grid-item ipc-sub-grid-item--span-2']//div[@class='ipc-lockup-overlay__screen']";

    public final String watchlistLocalator = ".ipc-split-button__btn";

    public final String documentaryLocalator = "//a[.='Documentary']";
    public final String shortLocalator = "//a[.='Short']";
    public final String actionLocalator = "//a[.='Action']";
    public final String photosHeaderLocalator = "//h3[.='Photos']";
    public final String photosContainerLocalator = "[data-testid='Photos'] > .ipc-shoveler";
    public final String topCastHeaderLocalator = "//span[.='Top cast']";

    public final String topCastContainerLocalator = ".ipc-sub-grid--wraps-at-above-l";
    public final String moreLikeLocalator = "//span[.='More like this']";
    public final String moreLikeContainerLocalator = "[data-testid='MoreLikeThis'] .ipc-sub-grid";
    public final String searchBox = "//input[@id='suggestion-search']";




    public void getMovieHeader()
    {
        String movieName = getText(By.xpath(movieHeaderLocalator));
        String searchedMovieName = "John Wick: Chapter 3 - Parabellum: HBO First Look";
        assertions.verifyMovieHeader(movieName,searchedMovieName);
        System.out.println(searchedMovieName);
        System.out.println(movieName);
    }
    public void verifyMoviePage_ShareIcon(){ isDisplayed(By.cssSelector(shareLocalator)); }
    public void verifyMoviePage_TopicIcon(){ isDisplayed(By.xpath(allTopicLocalator)); }
    public void verifyMoviePage_MoviePoster(){ isDisplayed(By.xpath(moviePosterLocalator)); }
    public void verifyMoviePage_DocumentaryButton(){ isDisplayed(By.xpath(documentaryLocalator)); }

    public void verifyMoviePage_ShortButton(){ isDisplayed(By.xpath(shortLocalator)); }

    public void verifyMoviePage_Action(){ isDisplayed(By.xpath(actionLocalator)); }

    public void verifyMoviePage_AddToWatchlist(){ isDisplayed(By.cssSelector(watchlistLocalator)); }

    public void scrollDown_HeaderPhotos(){scrollIntoView(By.xpath(photosHeaderLocalator));}

    public void verifyMoviePage_PhotosContainer(){ isDisplayed(By.cssSelector(photosContainerLocalator)); }

    public void scrollDown_CastHeader(){scrollIntoView(By.xpath(topCastHeaderLocalator));}
    public void verifyMoviePage_TopCastContainer(){ isDisplayed(By.cssSelector(topCastContainerLocalator)); }

    public void scrollDown_MoreLikeHeader(){scrollIntoView(By.xpath(moreLikeLocalator));}
    public void verifyMoviePage_MoreLikeContainer(){ isDisplayed(By.cssSelector(moreLikeContainerLocalator)); }
    public void scrollUp_SearchBox(){scrollIntoView(By.xpath(searchBox));}





}
