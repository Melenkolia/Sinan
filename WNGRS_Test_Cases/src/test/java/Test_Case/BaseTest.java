package Test_Case;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class BaseTest {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void setUP(@Optional("chrome") String Browser) throws InterruptedException {


        if (Browser.contains("firefox")) {

            // Initializing the firefox driver

            WebDriverManager.firefoxdriver().setup();

            driver = new FirefoxDriver();
        }

        else if (Browser.contains("chrome")) {

            // Initializing the chrome driver

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

        }

        driver.get("https://www.imdb.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        //driver.quit();
    }

}
