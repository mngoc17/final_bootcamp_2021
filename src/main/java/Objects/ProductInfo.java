package Objects;

import org.openqa.selenium.By;

public class ProductInfo {
    By quantity;
    By name;
    By description;
    By price;

    public ProductInfo(By quantity, By name, By description, By price) {
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public By getQuantity() {
        return quantity;
    }

    public void setQuantity(By quantity) {
        this.quantity = quantity;
    }

    public By getName() {
        return name;
    }

    public void setName(By name) {
        this.name = name;
    }

    public By getDescription() {
        return description;
    }

    public void setDescription(By description) {
        this.description = description;
    }

    public By getPrice() {
        return price;
    }

    public void setPrice(By price) {
        this.price = price;
    }
}
