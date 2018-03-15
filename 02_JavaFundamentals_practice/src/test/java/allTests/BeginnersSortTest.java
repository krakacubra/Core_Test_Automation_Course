package test.java.allTests;

import main.java.pen.stationery.*;
import main.java.pen.stationery.enums.DeskTopInstrumentsE;
import main.java.pen.stationery.enums.PaperE;
import main.java.pen.stationery.enums.WritingInstrumentsE;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BeginnersSortTest {
    BeginnersKit beginnersKit;

    Paper paper ;
    WritingInstruments pen ;
    WritingInstruments pencil ;
    DeskTopInstruments rubber ;
    WritingInstruments pen5;
    @Before
    public void setUp(){
        beginnersKit = new BeginnersKit();
    }
    @Test
    public void checkTestByPrice(){
        List<Stationery> check = new ArrayList<>();

        Paper paper = new Paper(PaperE.NOTEBOOK, 20,20F, "mybrand");
        WritingInstruments pen = new WritingInstruments(WritingInstrumentsE.PEN,
                0,0,0,4F, "mybrand");

        WritingInstruments pencil = new WritingInstruments(WritingInstrumentsE.PENCIL,
                0,0,0, 901F, "mybrand");
        DeskTopInstruments rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 154F,"mybrand");
        check.add(pen);
        check.add(paper);
        check.add(rubber);
        check.add(pencil);
        beginnersKit.priceSort();
        assertEquals(check, beginnersKit.getBeginnersKit().getRecord());
    }
    @Test
    public void checkTestByName(){
        List<Stationery> checkName = new ArrayList<>();

        Paper paper = new Paper(PaperE.NOTEBOOK, 20,20F, "mybrand");
        WritingInstruments pen = new WritingInstruments(WritingInstrumentsE.PEN,
                0,0,0,4F, "mybrand");
        WritingInstruments pencil = new WritingInstruments(WritingInstrumentsE.PENCIL,
                0,0,0, 901F, "mybrand");
        DeskTopInstruments rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 154F,"mybrand");
        checkName.add(rubber);
        checkName.add(paper);
        checkName.add(pen);
        checkName.add(pencil);
        beginnersKit.nameSort();
        assertEquals(checkName, beginnersKit.getBeginnersKit().getRecord());
    }
    //TODO: sort by price and name test with right checker!!!!
    @Test
    public void checkTestByPriceAndName(){
        List<Stationery> checkName = new ArrayList<>();

        Paper paper = new Paper(PaperE.NOTEBOOK, 20,20F, "mybrand");
        WritingInstruments pen = new WritingInstruments(WritingInstrumentsE.PEN,
                0,0,0,4F, "mybrand");
        WritingInstruments pen5 = new WritingInstruments(WritingInstrumentsE.PEN,
                0,0,0,5F, "mybrand");
        WritingInstruments pencil = new WritingInstruments(WritingInstrumentsE.PENCIL,
                0,0,0, 901F, "mybrand");
        DeskTopInstruments rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 154F,"mybrand");
        beginnersKit.getBeginnersKit().getRecord().add(pen5);
        checkName.add(rubber);
        checkName.add(paper);
        checkName.add(pen);
        checkName.add(pen5);

        checkName.add(pencil);
        beginnersKit.priceNameSort();
        assertEquals(checkName, beginnersKit.getBeginnersKit().getRecord());
    }

}
