package TestCases;

import Data.Data;
import Locators.CheckoutStepTwoPageLocators;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.OverviewPage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestLogin extends BaseTest {
    LoginPage loginPage;


    @BeforeClass
    @Parameters ({"browserName"})
    public void SetUp (@Optional("Chrome") String browserName) {
        super.SetUp(browserName);
        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void TearDown() {
        super.TearDown();
    }



    @Test (groups = { "smoketest", "regressiontest" }, priority = 1,
            description = "This is a login test case 01")
    public void verifyLoginSuccess () {
        loginPage.get(Constants.URL);
        loginPage.login(Data.defaultAccount());
        String getLoginURL = loginPage.getLoginURL();
        Assert.assertTrue(getLoginURL.contains(Constants.LOGIN_URL));

        driver.get("https://www.saucedemo.com/checkout-step-one.html");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkout(Data.defaultInfo());

        OverviewPage overviewPage = new OverviewPage(driver);
        String Product1_Quantity = overviewPage.GetProductInfo(CheckoutStepTwoPageLocators.label_product_quantity(1));
        String Product1_Name = overviewPage.GetProductInfo(CheckoutStepTwoPageLocators.label_product_name(1));
        String Product1_Desc = overviewPage.GetProductInfo(CheckoutStepTwoPageLocators.label_product_desc(1));
        String Product1_Price = overviewPage.GetProductInfo(CheckoutStepTwoPageLocators.label_product_price(1));
    }
}
