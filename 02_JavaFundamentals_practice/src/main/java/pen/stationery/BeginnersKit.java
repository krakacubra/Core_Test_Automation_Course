package main.java.pen.stationery;


import main.java.pen.stationery.comparators.StationeryNameComparator;
import main.java.pen.stationery.comparators.StationeryPriceComparator;
import main.java.pen.stationery.enums.DeskTopInstrumentsE;
import main.java.pen.stationery.enums.PaperE;
import main.java.pen.stationery.enums.WritingInstrumentsE;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeginnersKit {
    private StationaryManager beginnersKit;

    public BeginnersKit(){
        Paper paper = new Paper(PaperE.NOTEBOOK, 20,20F, "mybrand");
        WritingInstruments pen = new WritingInstruments(WritingInstrumentsE.PEN,
                0,0,0,4F, "mybrand");
        WritingInstruments pencil = new WritingInstruments(WritingInstrumentsE.PENCIL,
                0,0,0, 901F, "mybrand");
        DeskTopInstruments rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 154F,"mybrand");
        List<Stationery> kit = Arrays.asList(paper, pen, pencil, rubber);
        beginnersKit = new StationaryManager();
        beginnersKit.getRecords().addAll(kit);
    }

    public StationaryManager getBeginnersKit() {
        return beginnersKit;
    }

}
