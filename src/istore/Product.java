package istore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Product {
    private String productName;
    private double cost;
    private int numberOfProduct;

    public Product() {

        do {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Add new product:");
                System.out.print("Input product name: ");
                this.productName = consoleReader.readLine();
                System.out.print("Input number of product: ");
                this.numberOfProduct = Integer.parseInt(consoleReader.readLine());
                System.out.print("Input cost of product: ");
                this.cost = Double.parseDouble(consoleReader.readLine());
                if(!CheckData.checkProductName(productName) ||
                        !CheckData.checkNumberOfProduct(numberOfProduct) ||
                        !CheckData.checkCost(cost)) {
                    System.out.println("Invalid input data. Try again.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while(!CheckData.checkProductName(productName) ||
                !CheckData.checkNumberOfProduct(numberOfProduct) ||
                !CheckData.checkCost(cost));
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfProduct() {
        return this.numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }
}