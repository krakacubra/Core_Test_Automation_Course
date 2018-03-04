package main.java.pen.stationery;

import main.java.pen.Pen;

import java.util.ArrayList;

public class StationaryManager {
    private ArrayList<Stationery> record;
    public StationaryManager(){
        record = new ArrayList<>();
    }
    public ArrayList<Stationery> add(Stationery item){
        record.add(item);
        return record;
    }
    public float computeCost(){
        float sum = 0;
        for (Stationery item : this.record){
            sum += item.getPrice();
        }
        return sum;
    }

    public ArrayList<Stationery> getRecord() {
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
