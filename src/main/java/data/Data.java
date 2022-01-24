package data;

import objects.CheckoutInfo;
import utils.Constants;

public class Data {
    /**
     * Set default information
     * @return
     */
    public static CheckoutInfo defaultInfo() {
        return new CheckoutInfo(Constants.FIRSTNAME,Constants.LASTNAME,Constants.ZIPCODE);
    }
}
