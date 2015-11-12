package istore;

/**
 * Created by Vladislav on 11/6/2015.
 */

public class Menu {
    
    public static void run() throws ProductNotFoundException, NotUniqueProductException {
        Catalog catalog = new Catalog();
        int option = 0;
        ConsoleIO.printMenuList();
        while (option != 4) {
            option = ConsoleIO.requestMenuOption();
            switch (option) {
                case 1:
                    catalog.showAllProducts();
                    ConsoleIO.printMenuList();
                    break;
                case 2:
                    catalog.addNewProduct();
                    ConsoleIO.printMenuList();
                    break;
                case 3:
                    catalog.deleteProduct(ConsoleIO.getProductForRemove());
                    ConsoleIO.printMenuList();
                    break;
                case 4:
                    ConsoleIO.closeConsoleReader();
                    break;
                default:
                    ConsoleIO.informAboutUnknownOption();
            }
        }
    }    
}