package test.java;

import main.java.pen.stationery.*;
import main.java.pen.stationery.enums.DeskTopInstrumentsE;
import main.java.pen.stationery.enums.PaperE;
import main.java.pen.stationery.enums.WritingInstrumentsE;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StationeryComparatorTest {
    private BeginnersKit beginnersKit;
    private StationaryManager samePricesList;
    private StationaryManager sameNamesList;
    private StationaryManager randomList;
    private Paper notebook;
    private WritingInstruments pen;
    private WritingInstruments pencil;
    private DeskTopInstruments rubber;
    private Paper notebookPrice5;
    private WritingInstruments penPrice5;
    private WritingInstruments pencilPrice5;
    private DeskTopInstruments rubberPrice5;
    private WritingInstruments marker1;
    private WritingInstruments marker2;
    private WritingInstruments marker3;

    @Before
    public void setUp(){
        beginnersKit = new BeginnersKit();
        notebook = new Paper(PaperE.NOTEBOOK, 20,20F, "mybrand");
        pen = new WritingInstruments(WritingInstrumentsE.PEN,
                0,0,0,4F, "mybrand");

        pencil = new WritingInstruments(WritingInstrumentsE.PENCIL,
                0,0,0, 901F, "mybrand");
        rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 154F,"mybrand");

        notebookPrice5 = new Paper(PaperE.NOTEBOOK, 20,5F);
        pencilPrice5 = new WritingInstruments(WritingInstrumentsE.PENCIL, 5F);
        penPrice5 = new WritingInstruments(WritingInstrumentsE.PEN, 5F);
        rubberPrice5 = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER,5F);
        samePricesList = new StationaryManager();
        List<Stationery> kit = Arrays.asList(notebookPrice5, penPrice5, pencilPrice5, rubberPrice5);
        samePricesList.getRecords().addAll(kit);

        sameNamesList = new StationaryManager();
        marker1 = new WritingInstruments(WritingInstrumentsE.MARKER, 1F);
        marker2 = new WritingInstruments(WritingInstrumentsE.MARKER, 2F);
        marker3 = new WritingInstruments(WritingInstrumentsE.MARKER, 3F);
        List<Stationery> kitForMarkers = Arrays.asList(marker3, marker1, marker2);
        sameNamesList.getRecords().addAll(kitForMarkers);

        List<Stationery> random = Arrays.asList(marker2, marker1, pencilPrice5, notebookPrice5, penPrice5, marker3);
        randomList = new StationaryManager();
        randomList.getRecords().addAll(random);

    }
    @Test
    public void checkTestByPrice(){
        List<Stationery> check = new ArrayList<>();
        check.add(pen);
        check.add(notebook);
        check.add(rubber);
        check.add(pencil);
        beginnersKit.getBeginnersKit().priceSort();
        assertEquals(check, beginnersKit.getBeginnersKit().getRecords());
    }
    @Test
    public void checkTestByName(){
        List<Stationery> check = new ArrayList<>();
        check.add(notebook);
        check.add(pen);
        check.add(pencil);
        check.add(rubber);
        beginnersKit.getBeginnersKit().nameSort();
        assertEquals(check, beginnersKit.getBeginnersKit().getRecords());
    }
    @Test
    public void testByPriceAndNameShouldSortItemsWithTheSamePriceCorrectly(){
        List<Stationery> check = new ArrayList<>();
        check.add(notebookPrice5);
        check.add(penPrice5);
        check.add(pencilPrice5);
        check.add(rubberPrice5);
        samePricesList.priceNameSort();
        assertEquals(check, samePricesList.getRecords());
    }
    @Test
    public void testByPriceAndNameShouldSortItemsWithTheSameNameCorrectly(){
        List<Stationery> check = new ArrayList<>();
        check.add(marker1);
        check.add(marker2);
        check.add(marker3);
        sameNamesList.priceNameSort();
        assertEquals(check, sameNamesList.getRecords());
    }
    @Test
    public void testByPriceAndNameShouldSortRandomItemsCorrectly(){
        List<Stationery> check = new ArrayList<>();
        check.add(marker1);
        check.add(marker2);
        check.add(marker3);
        check.add(notebookPrice5);
        check.add(penPrice5);
        check.add(pencilPrice5);
        randomList.priceNameSort();
        assertEquals(check, randomList.getRecords());
    }
}
