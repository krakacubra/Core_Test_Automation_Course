package main.java.pen.stationery;

enum DeskTopInstrumentsE {
    HOLE_PUNCH,
    STAPLER,
    TAPE;
}

public class DeskTopInstruments
extends Stationery{
    DeskTopInstrumentsE item;

    public DeskTopInstruments(){
        super();
    }

    public DeskTopInstruments(DeskTopInstrumentsE item, float price){
        super(price);
        this.item = item;
    }

    public DeskTopInstruments(DeskTopInstrumentsE item, float price, String brand){
        super(brand, price);
        this.item = item;
    }

    public void setItem(DeskTopInstrumentsE item) {
        this.item = item;
    }

    public DeskTopInstrumentsE getItem() {
        return item;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            DeskTopInstruments deskTopInstrument = (DeskTopInstruments)obj;
            if (this.item == null){
                return (this.item == deskTopInstrument.item);
            }
            return this.item.equals(deskTopInstrument.item);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + item.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "item: " + this.item;
    }
}

