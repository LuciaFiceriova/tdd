package assignment3;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    private final int size;
    private final List<String> colourPalette;

    public ColourTable(int size) {
        if (!isValidPaletteSize(size)) {
            throw new InvalidSizeException();
        }
        this.size = size;
        this.colourPalette = new ArrayList<>();
    }

    public boolean isValidPaletteSize(int size) {
        return size > 1 && size <= 1024 && (size & (size - 1)) == 0;
    }

    public int getSize() {
        return size;
    }

    public void add(String colour) {
        if (!isValidColour(colour)) {
            throw new InvalidColourException();
        }
        colourPalette.add(colour);
    }

    public boolean contains(String colour) {
        return colourPalette.contains(colour);
    }

    public boolean isValidColour(String str) {
        if (str.charAt(0) != '#')
            return false;
        if (!(str.length() == 4 || str.length() == 7))
            return false;
        for (int i = 1; i < str.length(); i++)
            if (!((str.charAt(i) >= '0' && str.charAt(i) <= 9)
                    || (str.charAt(i) >= 'a' && str.charAt(i) <= 'f')
                    || (str.charAt(i) >= 'A' || str.charAt(i) <= 'F')))
                return false;
        return true;
    }


}


