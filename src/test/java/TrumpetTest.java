import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Mahogany", "Red", InstrumentType.STRING, 6);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", trumpet.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", trumpet.getColour());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.STRING, trumpet.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals(6, trumpet.getNoValves());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm the sound of a trumpet", trumpet.play());
    }
}
