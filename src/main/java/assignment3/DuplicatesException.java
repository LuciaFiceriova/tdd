package assignment3;

public class DuplicatesException extends  RuntimeException{
    public DuplicatesException () {
        super("Duplicates are not allowed in the palette");
    }
}
