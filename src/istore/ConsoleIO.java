package istore;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Vladislav on 11/6/2015.
 */
public class ConsoleIO {
    
    private static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    
    public static Product getInfoAboutNewProduct() {
        Product tmpProduct = new Product();
        do {
            try {
                System.out.println("New product:");
                System.out.print("Input product name: ");
                tmpProduct.setProductName(consoleReader.readLine());
                System.out.print("Input cost of product($): ");
                tmpProduct.setCost(Double.parseDouble(consoleReader.readLine()));
                if(!CheckData.checkProductName(tmpProduct.getProductName()) || !CheckData.checkCost(tmpProduct.getCost())) {
                    System.out.println("Invalid input data. Try again.");
                }
            } catch(IOException ex) {
                Logger.getLogger(ConsoleIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while(!CheckData.checkProductName(tmpProduct.getProductName()) || !CheckData.checkCost(tmpProduct.getCost()));
        return tmpProduct;
    }

    public static int requestMenuOption() {
        int option= 0;
        System.out.print("Input Option:");        
        try {
            option = Integer.parseInt(consoleReader.readLine());
        } catch (IOException ex) {
            Logger.getLogger(ConsoleIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return option;
    }

    
    
    public static Product getProductForRemove() {
        
        Product productForRemove = new Product();    
        System.out.print("Input name of product:");        
        try {
            productForRemove.setProductName(consoleReader.readLine());
            productForRemove.setCost(0);            
        } catch (IOException ex) {
            Logger.getLogger(ConsoleIO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return productForRemove;
    }

    public static void printListOfAllProducts(List<Product> allProducts) {
        if(allProducts.isEmpty()) {
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
    
    public static void close(Closeable c) {
     if (c == null) return; 
        try {
            c.close();
        } catch (IOException ex) {
            Logger.getLogger(ConsoleIO.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
    public static void closeConsoleReader() {
        close(consoleReader);
    }
    
}