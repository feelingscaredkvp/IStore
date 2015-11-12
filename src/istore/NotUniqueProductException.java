package istore;

/**
 *
 * @author vladislav
 */

public class NotUniqueProductException extends Exception {
    
    public NotUniqueProductException() {}
    
    public NotUniqueProductException(String detailMessage) {
        super(detailMessage);
    }
    
}