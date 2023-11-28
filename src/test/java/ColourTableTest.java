import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTableTest {
    @Test
    public void testNumOfColours(){
        int numOfColours = 16;
        ColourTable colourTable = new ColourTable(numOfColours);
        Assertions.assertNotNull(colourTable, "ColourTable object should not be null");
    }

    @Test
    public void testAdd() {
        int capacity = 4;
        ColourTable colourTable = new ColourTable(capacity);

        int red = 0xFF0000;
        int green = 0x00FF00;
        int blue = 0x0000FF;

        colourTable.add(red);
        colourTable.add(green);
        colourTable.add(blue);

        Assertions.assertEquals(capacity, colourTable.getNumOfColoursAdded(), "Number of colours added to the table should not exceed the capacity");
    }

}
