package main.java.pen.stationery.comparators;

import main.java.pen.stationery.DeskTopInstruments;
import main.java.pen.stationery.Paper;
import main.java.pen.stationery.Stationery;
import main.java.pen.stationery.WritingInstruments;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StationeryNameComparator
implements Comparator<Stationery>{
    @Override
    public int compare(Stationery o1, Stationery o2) {

        if (o1.toString().compareTo(o2.toString()) < 0) {
            return -1;
        }
        return o1.toString().compareTo(o2.toString()) > 0 ? 1 : 0;
    }
}
