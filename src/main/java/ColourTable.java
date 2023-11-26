public class ColourTable {
    private final int numOfColours;

    public ColourTable(int numOfColours) {
        if (!(numOfColours > 1 && numOfColours < 1025 && (numOfColours & (numOfColours - 1)) == 0)) {
            throw new IllegalArgumentException("Number of colours must be a power of two, greater than 1 and less than 1025");
        }
        this.numOfColours = numOfColours;
    }
}
