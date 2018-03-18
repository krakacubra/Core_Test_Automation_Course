package main.java.pen.stationery.comparators;

import main.java.pen.stationery.DeskTopInstruments;
import main.java.pen.stationery.Paper;
import main.java.pen.stationery.Stationery;
import main.java.pen.stationery.WritingInstruments;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StationeryNameComparator
implements Comparator<Stationery>{
    @Override
    public int compare(Stationery o1, Stationery o2) {
        Pattern patternToItem = Pattern.compile(".+@ item: (\\w+).+");
        Matcher match1 = patternToItem.matcher(o1.toString());
        Matcher match2 = patternToItem.matcher(o2.toString());
        match1.find();
        match2.find();
        if (match1.group(1).compareTo(match2.group(1)) < 0) {
            return -1;
        }
        return match1.group(1).compareTo(match2.group(1)) > 0 ? 1 : 0;
    }
}
