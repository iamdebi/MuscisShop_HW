import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Violin violin;

    @Before
    public void before(){
        violin = new Violin("Mahogany", "Red", InstrumentType.STRING, "Beginner");
    }

    @Test
    public void canGetMaterial(){
      assertEquals("Mahogany", violin.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", violin.getColour());
    }

    @Test
    public void canGetTpe(){
        assertEquals(InstrumentType.STRING, violin.getType());
    }

    @Test
    public void canGetLevel(){
        assertEquals("Beginner", violin.getLevel());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm the sound of a Violin", violin.play());
    }

}
