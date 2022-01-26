package Data;

import Locators.CheckoutStepTwoPageLocators;
import Objects.Account;
import Objects.CheckoutInfo;
import Objects.ProductInfo;
import Utils.Constants;
import Utils.Utility;
import java.util.ArrayList;

public class Data {
    public static Account defaultAccount () {
        return new Account(Constants.USERNAME, Constants.PASSWORD);
    }

    /**
     * Set default information
     * @return
     */
    public static CheckoutInfo defaultInfo() {
        return new CheckoutInfo(Constants.FIRSTNAME, Constants.LASTNAME, Constants.ZIPCODE);
    }

    /**
     * Set product information in the Overview page
     * @param index
     * @return
     */
    public static ProductInfo productInfoOverview(int index) {
        return new ProductInfo(CheckoutStepTwoPageLocators.label_product_quantity(index),
                CheckoutStepTwoPageLocators.label_product_name(index),
                CheckoutStepTwoPageLocators.label_product_desc(index),
                CheckoutStepTwoPageLocators.label_product_price(index));
    }

    public static ArrayList<Account> getAccountsCSV(String file, String delimiter) {
        ArrayList<String> arrayList = Utility.readCSV(file);
        ArrayList<Account> list_accounts = new ArrayList<>();

        for (Object string : arrayList) {
            String [] array = string.toString().split(delimiter);
            list_accounts.add(new Account(array[0], array[1]));
        }
        return list_accounts;
    }
}
