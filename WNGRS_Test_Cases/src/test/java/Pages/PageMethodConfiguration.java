package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

public class PageMethodConfiguration {

    static WebDriver driver;

    public PageMethodConfiguration(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void search(By locator, String Text){find(locator).sendKeys(Text);}

    public String getText(By locator) {
        WebElement element = (find(locator));
        String movieName = element.getText();
        return movieName;
    }


    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public void waitForElement(String elementID) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementID)));
    }

    public void writeKeyWord(By locator, String text) {
        find(locator).sendKeys(text);
    }
    

    public void scrollIntoView(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", element);

    }

/* Dynamic Email Generate
    public static String generateDynamicEmail(String prefix) {

        Random rand = new Random();
        String domain = "@hotmail.com.tr";

        int randomNumber = rand.nextInt(1000);
        String dynamicEmail = prefix + randomNumber + domain;

        return dynamicEmail;

    }
*/
}
