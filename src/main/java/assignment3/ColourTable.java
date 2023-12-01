package assignment3;

public class ColourTable {
    private final int size;

    public ColourTable(int size) {
        if (!isValidPaletteSize(size)) {
            throw new InvalidSizeException();
        }
        this.size = size;
    }

    public boolean isValidPaletteSize(int size) {
        return size > 1 && size <= 1024 && (size & (size - 1)) == 0;
    }

    public int getSize() {
        return size;
    }

}


