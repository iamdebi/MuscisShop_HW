import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private MusicShop shop;
    private AcousticGuitar acousticGuitar;
    private DrumSticks drumSticks;
    private SheetMusic music;
    private SheetMusic sheetMusic;
    private ArrayList<ISell> stock;

    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("wood", "red", InstrumentType.STRING, 6, 260, 100);
        drumSticks = new DrumSticks("Vic Firth", 5, 10);
        music = new SheetMusic("Blue Bird", 5, 15);
        music = new SheetMusic("Dance Monkey", 7, 15);
        stock = new ArrayList<ISell>();
        stock.add(acousticGuitar);
        stock.add(drumSticks);
        stock.add(music);
        shop = new MusicShop(stock);
    }

    @Test
    public void canCountStock(){
        assertEquals(3, shop.stockCount());
    }

    @Test
    public void canAddStock(){
        shop.addStock(sheetMusic);
        assertEquals(4, shop.stockCount());
    }

    @Test
    public void canFindFirst(){
        int result = shop.findStockIndex(acousticGuitar);
        assertEquals(0, result);
    }

    @Test
    public void canFindMiddle(){
        int result = shop.findStockIndex(drumSticks);
        assertEquals(1, result);
    }

    @Test
    public void canFindEnd(){
        int result = shop.findStockIndex(music);
        assertEquals(2, result);
    }

    @Test
    public void CanRemoveStock(){
        shop.removeStock(drumSticks);
        assertEquals(2, shop.stockCount());
    }




}
