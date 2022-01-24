package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import utils.Constants;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Set up Drivers
     * @param browser
     * @return
     */
    public WebDriver setupDriver(String browser) {
        if (browser.equalsIgnoreCase("ff") || browser.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
            driver = new FirefoxDriver();
        } else {
//            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            driver = new ChromeDriver();
        }

        maximize();
        driver.manage().timeouts().pageLoadTimeout(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT,TimeUnit.SECONDS);

        return driver;
    }

    /**
     * Maximize Browser
     */
    public void maximize() {
        Reporter.log("Maximize browser");
        driver.manage().window().maximize();
    }

    /**
     * Find the element
     * @param by
     * @return
     */
    public WebElement findElement(By by) {
        Reporter.log("Find the element by locator " + by.toString());
        return driver.findElement(by);
    }

    /**
     * Find the element & wait
     * @param by
     * @param seconds
     */
    public WebElement waitElementClickable(By by, int seconds) {
        Reporter.log("Wait the element by locator " + by.toString() + " during " + seconds + " seconds");
        return new WebDriverWait(driver, seconds)
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    /**
     * Fullscreen method
     */
    public void fullscreen() {
        Reporter.log("Fullscreen");
        driver.manage().window().fullscreen();
    }

    /**
     * Refresh Browser
     */
    public void refresh() {
        Reporter.log("Refresh");
        driver.navigate().refresh();
    }

    /**
     * Back Browser
     */
    public void back() {
        Reporter.log("Back browser");
        driver.navigate().back();
    }

    /**
     * Forward Browser
     */
    public void forward() {
        Reporter.log("Forward browser");
        driver.navigate().forward();
    }

    /**
     * Navigate to the URL
     * @param url
     */
    public void get(String url){
        Reporter.log("Navigate to " + url);
        driver.get(url);
    }

    /**
     * Get Title
     * @return
     */
    public String getTitle() {
        Reporter.log("Get current title");
        return driver.getTitle();
    }

    /**
     * Get Current URL
     * @return
     */
    public String getCurrentUrl() {
        Reporter.log("Get current URL");
        return driver.getCurrentUrl();
    }

    /**
     * Get Text
     */
    public String getText(By by) {
        Reporter.log("Get text on the element by locator " + by.toString());
        return findElement(by).getText();
    }

    /**
     * sendKeys
     * @param by
     * @param value
     */
    public void sendKeys(By by, String value) {
        Reporter.log("Set text on the element by locator " + by.toString() + " with the value: " + value);
        findElement(by).sendKeys(value);
    }

    /**
     * click on element
     * @param by
     */
    public void click(By by) {
        Reporter.log("Click on the element by locator " + by.toString());
        findElement(by).click();
    }

    /**
     * Clear element
     */
    public void clear(By by) {
        Reporter.log("Clear text on the element by locator " + by.toString());
        findElement(by).clear();
    }

    /**
     * Check Element isEnabled or not
     * @param by
     * @return
     */
    public boolean isEnabled(By by) {
        Reporter.log("Get Enabled property on the element by locator " + by.toString());
        return findElement(by).isEnabled();
    }

    /**
     * Check Element isSelected or not
     * @param by
     * @return
     */
    public boolean isSelected(By by) {
        Reporter.log("Get Selected property on the element by locator " + by.toString());
        return findElement(by).isSelected();
    }

    /**
     * Check Element isDisplayed or not
     * @param by
     * @return
     */
    public boolean isDisplayed(By by) {
        Reporter.log("Get Displayed property on the element by locator " + by.toString());
        return findElement(by).isDisplayed();
    }

    /**
     * Get TagName of an element
     * @param by
     * @return
     */
    public String getTagName(By by) {
        Reporter.log("Get TagName on the element by locator " + by.toString());
        return findElement(by).getTagName();
    }

    /**
     * Get Rectangle of an element
     * @param by
     * @return
     */
    public Rectangle getRect(By by) {
        Reporter.log("Get Rectangle on the element by locator " + by.toString());
        return findElement(by).getRect();
    }

    /**
     * Get CssValue of an element
     * @param by
     * @return
     */
    public String getCssValue(By by, String value) {
        Reporter.log("Get CssValue on the element by locator " + by.toString());
        return findElement(by).getCssValue(value);
    }
}
