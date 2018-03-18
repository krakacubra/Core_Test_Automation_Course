package main.java.pen.stationery.comparators;

import main.java.pen.stationery.Stationery;

import java.util.Comparator;

public class StationeryPriceComparator
        implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        float price1 = o1.getPrice();
        float price2 = o2.getPrice();
        if (price1 < price2){
            return -1;
        }
        return price1 > price2 ? 1 : 0;
    }
}
