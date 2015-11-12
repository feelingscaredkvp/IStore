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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
	if (obj == null) return false;	
	Product other = (Product) obj;
	return this.productName.equals(other.productName);       
    }

    @Override
    public int hashCode() {
        final int prime = 31;
	int result = 1;
	result = prime * result + this.productName.hashCode();	
	return result;
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