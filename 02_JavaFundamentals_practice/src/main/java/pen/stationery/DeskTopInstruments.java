package main.java.pen.stationery;


import main.java.pen.stationery.enums.DeskTopInstrumentsE;

public class DeskTopInstruments extends Stationery{
    private DeskTopInstrumentsE item;

    public DeskTopInstruments(){
        super();
    }

    public DeskTopInstruments(DeskTopInstrumentsE item){
        super();
        this.item = item;
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
        return super.hashCode() + (item == null ? 0 : item.hashCode());
    }

    @Override
    public String toString() {
         return getClass().getName() + "@"
                + " item: " + this.item
                + ", brand: " + this.getBrand()
                + ", price: " + this.getPrice();
    }
}

