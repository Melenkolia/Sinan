package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class PageMethodConfiguration {

    static WebDriver webDriver;

    public PageMethodConfiguration(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static String readExcelData(String filePath, String sheetName, int rowNum, int colNum) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        System.out.println("Sheet Name: " + sheet);


        XSSFRow row = (XSSFRow) sheet.getRow(rowNum);
        XSSFCell cell = (XSSFCell) ((Row) row).getCell(colNum);

        String cellData = getCellValueAsString(cell);

        workbook.close();
        fileInputStream.close();

        System.out.println(cellData);

        return cellData;
    }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return "";
        }

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    public WebElement find(By locator) {
        return webDriver.findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }


    public Boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public void waitForElement(String elementID) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementID)));
    }
    public synchronized static void waitForElementVisibility(WebElement element, int timeOut, String elementName) {
        //Wait<WebDriver> wait = null;
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver).withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(1))
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("element is not visible - " + elementName);
        }
    }

    public static void clickElement(By locator) {

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (ElementClickInterceptedException e) {
            WebElement element = webDriver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].click();", element);
        }
    }


    public void scrollIntoView(By elementLocator) {
        WebElement element = webDriver.findElement(elementLocator);

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", element);

    }
    public static void waitInSeconds(int secVal) {
        try {
            Thread.sleep(secVal * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollUp(By elementLocator) {
        WebElement element = webDriver.findElement(elementLocator);

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView({block: 'start', inline: 'start'});", element);
    }

    public void writeText(By locator, String text){

        WebElement element = find(locator);
        element.click();
        element.sendKeys(text);

    }

    public static String generateRandomGmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            email.append(characters.charAt(random.nextInt(characters.length())));
        }
        email.append("@gmail.com");
        return email.toString();
    }

    public static String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }


}




