package assignment3;

public class InvalidColourException extends RuntimeException{
    public InvalidColourException() {
        super("Colour value must be in the correct RGB hexadecimal format");
    }
}
