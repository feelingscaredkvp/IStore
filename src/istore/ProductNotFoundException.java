package istore;

/**
 *
 * @author vladislav
 */

public class ProductNotFoundException extends Exception {
    
    public ProductNotFoundException() {}
    
    public ProductNotFoundException(String detailMessage) {
        super(detailMessage);
    }
    
}