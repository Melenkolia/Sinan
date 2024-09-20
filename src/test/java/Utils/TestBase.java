package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static Utils.PageMethodConfiguration.waitInSeconds;


public class TestBase {
    protected WebDriver webDriver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) throws InterruptedException {
        webDriver = Driver.getDriver(browser);  // Tarayıcı seçimi yapılır
        webDriver.get("https://www.kariyer.net");

        webDriver.manage().window().maximize();
        waitInSeconds(5);  // Bekleme süresi ekleyebilirsiniz
        System.out.println("The page title is : " + webDriver.getTitle());
    }

    @AfterTest
    public void tearDown() {
//        Driver.quitDriver(webDriver);  // Driver'ı kapatır
    }
}
