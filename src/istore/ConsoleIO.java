package istore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Vladislav on 11/6/2015.
 */
public class ConsoleIO {
    public static Product getInfoAboutNewProduct() {
        Product tmpProduct = new Product();
        do {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                //System.out.println("Add new product:");
                System.out.print("Input product name: ");
                tmpProduct.setProductName(consoleReader.readLine());
                System.out.print("Input cost of product($): ");
                tmpProduct.setCost(Double.parseDouble(consoleReader.readLine()));
                if(!CheckData.checkProductName(tmpProduct.getProductName()) || !CheckData.checkCost(tmpProduct.getCost())) {
                    System.out.println("Invalid input data. Try again.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while(!CheckData.checkProductName(tmpProduct.getProductName()) || !CheckData.checkCost(tmpProduct.getCost()));
        return tmpProduct;
    }

    public static int requestMenuOption() {
        int option= 0;
        System.out.print("Input Option:");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            option = Integer.parseInt(consoleReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return option;
    }

    public static String getNameOfProductForDelete() {
        String productName = "";
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input name of product:");
        try {
            productName = consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productName;
    }

    public static void printListOfAllProducts(List<Product> allProducts) {
        if(allProducts.size() == 0) {
            System.out.println("Catalog is empty yet.");
        } else {
            System.out.println("All products:");
            for (int i = 0; i < allProducts.size(); i++) {
                System.out.println((i+1) + ")\n\r\t" + "Name of product: " + allProducts.get(i).getProductName() +
                                            "\n\r\t" + "Cost of product($): " + allProducts.get(i).getCost());
            }
        }
    }

    public static void printMenuList() {
        System.out.println("--------------------");
        System.out.println("[1]Show All Products");
        System.out.println("[2]Add New Product");
        System.out.println("[3]Delete Product");
        System.out.println("[4]Exit");
        System.out.println("--------------------");
    }

    public static void informAboutUnknownOption() {
        System.out.println("Unknown option.");
    }

    public static void informAboutNotFoundedProduct() {
        System.out.println("Product not found.");
    }

    public static void informAboutNonUniqueProduct() {
        System.out.println("Product with same name is already added.");
    }
}
