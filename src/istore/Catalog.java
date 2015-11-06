package istore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Catalog {

    private List<Product> allProducts = new ArrayList<>();

    public void showAllProducts() {
        ConsoleIO.printListOfAllProducts(this.allProducts);
    }

    public void addNewProduct() {
        Product product = ConsoleIO.getInfoAboutNewProduct();
        if(!CheckData.isUnique(product, getCollectionOfAllProducts())) {
            allProducts.add(new Product(product.getProductName(), product.getCost()));
        } else {
            ConsoleIO.informAboutNonUniqueProduct();
        }
    }

    public void deleteProduct(String nameOfProductForDelete) {
        boolean flag = false;
        Iterator<Product> iterator = this.allProducts.iterator();
        while(iterator.hasNext()) {
            Product product = iterator.next();
            if(product.getProductName().equals(nameOfProductForDelete)) {
                iterator.remove();
                flag = true;
                break;
            }
        }
        if(!flag) {
            ConsoleIO.informAboutNotFoundedProduct();
        }
    }

    private List<String> getCollectionOfAllProducts() {
        List<String> CollectionOfAllProducts = new ArrayList<>();
        for(Product product : this.allProducts) {
            CollectionOfAllProducts.add(product.getProductName());
        }
        return CollectionOfAllProducts;
    }

    public List<Product> getAllProducts() {
        return this.allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }
}