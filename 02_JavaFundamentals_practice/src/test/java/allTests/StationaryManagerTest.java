package test.java.allTests;

import main.java.pen.stationery.*;
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
        String str = "There are 3 items in list.\nList of stationary:\n";
        assertEquals(str, stationaryManager.toString());
    }
}
