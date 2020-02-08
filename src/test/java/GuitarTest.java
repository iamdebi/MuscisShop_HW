import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Mahogany", "Red", InstrumentType.STRING, 6);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals(6, guitar.getNoStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm the sound of a guitar", guitar.play());
    }

}
