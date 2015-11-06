package istore;

import java.util.List;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class CheckData {
    public static boolean checkProductName(String productName) {

        return true;
    }

    public static boolean checkCost(double cost) {

        return true;
    }

    public static boolean checkOption(int option) {

        return true;
    }

    public static boolean isUnique(Product product, List<String> collectionOfAllProducts) {
        return collectionOfAllProducts.contains(product.getProductName());
    }
}