package istore;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Product {
    private String productName;
    private double cost;

    public Product() {}

    public Product(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
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
}