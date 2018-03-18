package main.java.pen.stationery;

import main.java.pen.stationery.comparators.StationeryNameComparator;
import main.java.pen.stationery.comparators.StationeryPriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StationaryManager {
    private List<Stationery> records;
    public StationaryManager(){
        records = new ArrayList<Stationery>();
    }
    public float computeCost(){
        float sum = 0;
        for (Stationery item : this.records){
            sum += item.getPrice();
        }
        return sum;
    }

    public List<Stationery> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        String record = String.format("There are %d items in list.\nList of stationary:\n", ((this.records == null) ? 0 : this.records.size()));
        if (record != null) {
            for (Stationery stationery : this.records) {
                record += stationery.toString();
                record += "\n";
            }
        }
        return record;
    }
    public void priceSort(){
        Collections.sort(records, new StationeryPriceComparator());
    }
    public void nameSort(){
        Collections.sort(records, new StationeryNameComparator());
    }
    public void priceNameSort(){
        Comparator<Stationery> comparator = new StationeryPriceComparator()
                .thenComparing(new StationeryNameComparator());
        Collections.sort(records, comparator);
    }
}
