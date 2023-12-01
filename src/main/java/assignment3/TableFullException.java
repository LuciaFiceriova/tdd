package assignment3;

public class TableFullException extends RuntimeException {
    public TableFullException() {
        super("The capacity of the palette has been exceeded");
    }
}


