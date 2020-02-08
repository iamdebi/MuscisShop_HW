import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Mahogany", "Red", InstrumentType.STRING, 88);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", piano.getColour());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.STRING, piano.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals(88, piano.getNoKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm the sound of a piano", piano.play());
    }
}
