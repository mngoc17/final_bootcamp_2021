package Locators;

import org.openqa.selenium.By;

public class CheckoutStepTwoPageLocators {
    //ellements of paymentInformation, shippingInformation, itemTotal, tax, total, cancelButton, finishButton
    public static By label_product_quantity(int index) {
        return By.xpath("//div[@class='cart_list'][" + index + "]//div[@class='cart_quantity']");
    }
    public static By label_product_name(int index) {
        return By.xpath("//div[@class='cart_list'][" + index + "]//div[@class='inventory_item_name']");
    }
    public static By label_product_desc(int index) {
        return By.xpath("//div[@class='cart_list'][" + index + "]//div[@class='inventory_item_desc']");
    }
    public static By label_product_price(int index) {
        return By.xpath("//div[@class='cart_list'][" + index + "]//div[@class='inventory_item_price']");
    }
}
