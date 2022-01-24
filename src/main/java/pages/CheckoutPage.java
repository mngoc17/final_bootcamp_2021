package pages;

import locators.CheckoutLocators;
import objects.CheckoutInfo;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Check out
     * @param checkoutInfo
     */
    public void checkout(CheckoutInfo checkoutInfo) {
        sendKeys(CheckoutLocators.input_firstname, checkoutInfo.getFirstname());
        sendKeys(CheckoutLocators.input_lastname, checkoutInfo.getLastname());
        sendKeys(CheckoutLocators.input_zipcode, checkoutInfo.getCode());
        click(CheckoutLocators.button_continue);
    }
}

