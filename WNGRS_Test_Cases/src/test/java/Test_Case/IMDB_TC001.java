package Test_Case;

import Pages.HomePage;
import Pages.MoviePage;
import org.testng.annotations.Test;


public class IMDB_TC001 extends BaseTest {

    HomePage homePage;
    MoviePage moviePage;

    @Test(priority = 1, description = "IMDB Search Function Test Case")
    public void IMDB_Search_TestCases() throws InterruptedException {

        homePage = new HomePage(driver);
        Thread.sleep(2000);

        homePage.acceptCookies();

        homePage.verifyHomePage_IMDbHeader();
        homePage.verifyHomePage_MenuIcon();
        homePage.verifyHomePage_SıgnInIcon();
        homePage.verifyHomePage_UseAppIcon();
        homePage.verifyHomePage_ContentContainer();
        Thread.sleep(2000);
        homePage.searchMovie();
        homePage.verifyHomePage_SearchSuggestionContainer();
        Thread.sleep(2000);
        homePage.selectSearchSuggestion();

        moviePage = new MoviePage(driver);
        moviePage.getMovieHeader();
        moviePage.verifyMoviePage_ShareIcon();
        moviePage.verifyMoviePage_TopicIcon();
        moviePage.verifyMoviePage_MoviePoster();
        moviePage.verifyMoviePage_AddToWatchlist();
        moviePage.verifyMoviePage_DocumentaryButton();
        moviePage.verifyMoviePage_ShortButton();
        moviePage.verifyMoviePage_Action();
        moviePage.scrollDown_HeaderPhotos();
        moviePage.verifyMoviePage_PhotosContainer();
        moviePage.scrollDown_CastHeader();
        moviePage.verifyMoviePage_TopCastContainer();
        moviePage.scrollDown_MoreLikeHeader();
        moviePage.verifyMoviePage_MoreLikeContainer();
        Thread.sleep(2000);
        moviePage.scrollUp_SearchBox();


    }

}
