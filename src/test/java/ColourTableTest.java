import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTableTest {
    @Test
    public void testNumOfColours(){
        int numOfColours = 20;
        ColourTable colourTable = new ColourTable(numOfColours);
        Assertions.assertNotNull(colourTable, "ColourTable object should not be null");
    }
}
