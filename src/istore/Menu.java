package istore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Menu {
    public void run() {
        Catalog catalog = new Catalog();
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        printMenu();
        while (option != 4) {
            try {
                System.out.print("Input Option:");
                option = Integer.parseInt(consoleReader.readLine());
                switch(option) {
                    case 1:
                        catalog.showAllProducts();
                        printMenu();
                        break;
                    case 2:
                        catalog.addNewProduct();
                        printMenu();
                        break;
                    case 3:
                        catalog.deleteProduct();
                        printMenu();
                        break;
                    case 4:break;
                    default: System.out.println("Unknown option.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void printMenu() {
        System.out.println("--------------------");
        System.out.println("[1]Show All Products");
        System.out.println("[2]Add New Product");
        System.out.println("[3]Delete Product");
        System.out.println("[4]Exit");
        System.out.println("--------------------");
    }
}