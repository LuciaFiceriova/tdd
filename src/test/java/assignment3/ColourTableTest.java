package assignment3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ColourTableTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 4, 16, 1026})
    public void testInvalidPaletteSize(Integer size) {
        ColourTable colourTable = new ColourTable(size);
        Assertions.assertEquals(size, colourTable.getSize());
    }

    @ParameterizedTest
    @ValueSource(strings = {"#FF0000", "025457", "#556B2f", "#FFF00"})
    public void testAddInvalidColour(String colour) {
        ColourTable colourTable = new ColourTable(4);
        colourTable.add(colour);
        Assertions.assertTrue(colourTable.contains(colour));
    }





}
