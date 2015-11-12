package istore;

/**
 *
 * @author vladislav
 */

public class NotUniqueProductException extends Exception {
    
    public NotUniqueProductException() {}
    
    NotUniqueProductException(String detailMessage) {
        super(detailMessage);
    }
    
}