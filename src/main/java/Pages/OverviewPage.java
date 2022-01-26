package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Get product information in the Overview page
     * @param by
     * @return
     */
    public String GetProductInfo(By by) {
        return getText(by);
    }
}
