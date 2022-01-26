package Pages;

import Objects.ProductInfo;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Get product information in the Overview page
     * @param productInfo
     * @return
     */
    public String GetProductInfo(ProductInfo productInfo) {
        String quantity = getText(productInfo.getQuantity());
        String name = getText(productInfo.getName());
        String desc = getText(productInfo.getDescription());
        String price = getText(productInfo.getPrice());
        return "Product 1: " +
                "Quantity: " + quantity +
                ", Name: " + name +
                ", Description: " + desc +
                ", Price: " + price;
    }
}
