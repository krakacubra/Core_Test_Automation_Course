package main.java.pen.stationery;

import main.java.pen.Pen;

import java.util.ArrayList;
import java.util.List;

public class StationaryManager {
    private List<Stationery> record;
    public StationaryManager(){
        record = new ArrayList<Stationery>();
    }
    public float computeCost(){
        float sum = 0;
        for (Stationery item : this.record){
            sum += item.getPrice();
        }
        return sum;
    }

    public List<Stationery> getRecord() {
        return record;
    }

    @Override
    public String toString() {
        String record = String.format("There are %d items in list.\nList of stationary:\n", ((this.record == null) ? 0 : this.record.size()));
        if (record != null) {
            for (Stationery stationery : this.record) {
                record += stationery.toString();
                record += "\n";
            }
        }
        return record;
    }
}
