package istore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Catalog {

    private List<Product> allProducts = new ArrayList<>();

    public void showAllProducts() {
        if(allProducts.size() == 0) {
            System.out.println("Catalog is empty yet.");
        } else {
            System.out.println("All products:");
            for (int i = 0; i < allProducts.size(); i++) {
                System.out.println((i+1) + ")\n\r\t" + "Name of product: " + allProducts.get(i).getProductName() +
                        "\n\r\t" + "Number of product: " + allProducts.get(i).getNumberOfProduct() +
                        "\n\r\t" + "Cost of product($): " + allProducts.get(i).getCost());
            }
        }
    }

    public void addNewProduct() {
        allProducts.add(new Product());
    }

    public void deleteProduct() {
        String productName = "";
        boolean flag = false;
        Iterator<Product> iterator = this.allProducts.iterator();
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input name of product:");
        try {
            productName = consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(iterator.hasNext()) {
            Product product = iterator.next();
            if(product.getProductName().equals(productName)) {
                iterator.remove();
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("Product " + productName + " not found.");
        }
    }

    /*
    private List<String> getCollectionOfAllProducts() {
        List<String> CollectionOfAllProducts = new ArrayList<>();
        for(Product product : this.allProducts) {
            CollectionOfAllProducts.add(product.getProductName());
        }
        return CollectionOfAllProducts;
    }
    */

    public List<Product> getAllProducts() {
        return this.allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }
}