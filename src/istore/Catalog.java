package istore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Catalog {

    private List<Product> allProducts = new ArrayList<>();    

    public void showAllProducts() {
        ConsoleIO.printListOfAllProducts(this.allProducts);
    }

    public void addNewProduct() throws NotUniqueProductException {                        
        Product product = ConsoleIO.getInfoAboutNewProduct();
        if(!isUnique(product))  {
            allProducts.add(new Product(product.getProductName(), product.getCost()));
        } else {
            throw new NotUniqueProductException();
        }
    }

    public void deleteProduct(Product productForRemove) throws ProductNotFoundException {            
            if(!allProducts.remove(productForRemove)) {
                throw new ProductNotFoundException();
            }        
    }
    
    private boolean isUnique(Product product) {
        return this.allProducts.contains(product);
    }

    public List<Product> getAllProducts() {
        return this.allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }
}