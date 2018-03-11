package test.java.allTests;

import main.java.pen.stationery.*;
import main.java.pen.stationery.enums.DeskTopInstrumentsE;
import main.java.pen.stationery.enums.PaperE;
import main.java.pen.stationery.enums.WritingInstrumentsE;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationaryManagerTest {
    private StationaryManager stationaryManager;
    private Paper paper;
    private WritingInstruments marker;
    private DeskTopInstruments rubber;
    private DeskTopInstruments holePunch;
    @Before
    public void setUp(){
        stationaryManager = new StationaryManager();
        paper = new Paper(PaperE.NOTEBOOK, 12,34F);
        marker = new WritingInstruments(WritingInstrumentsE.MARKER, 23F);
        rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 12F);
        holePunch = new DeskTopInstruments(DeskTopInstrumentsE.HOLE_PUNCH);
        stationaryManager.getRecord().add(paper);
        stationaryManager.getRecord().add(marker);
        stationaryManager.getRecord().add(rubber);

    }
    @Test
    public void computeCostMustReturnRightCost(){
        float cost = paper.getPrice() + marker.getPrice() + rubber.getPrice();
        assertEquals(cost, stationaryManager.computeCost(), 0);
    }
    @Test
    public void cumputeCostMustHandleWithEmptyPriceField(){
        stationaryManager.getRecord().add(holePunch);
        float cost = paper.getPrice() + marker.getPrice() + rubber.getPrice() + 0;
        assertEquals(cost, stationaryManager.computeCost(), 0);
    }
    @Test
    public void  setStationaryManagerToStringReturnAllNecessaryInformation(){
        String str = "There are 3 items in list.\n" +
                "List of stationary:\n" +
                "main.java.pen.stationery.Paper@ price: 34.0, brand: null, item: NOTEBOOK, number of pages: 12\n" +
                "main.java.pen.stationery.WritingInstruments@ price: 23.0, brand: null, item: MARKER, color: 0, 0, 0\n" +
                "main.java.pen.stationery.DeskTopInstruments@ price: 12.0, brand: null, item: RUBBER\n";
        assertEquals(str, stationaryManager.toString());
    }
}
