package assignment3;

public class InvalidSizeException extends RuntimeException {
    public InvalidSizeException() {
        super("Number of colours must be a power of two, greater than 1, and less than 1025");
    }
}
