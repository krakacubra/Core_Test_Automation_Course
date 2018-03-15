package main.java.pen.stationery;


import main.java.pen.stationery.enums.WritingInstrumentsE;

public class WritingInstruments extends Stationery{
    private WritingInstrumentsE item;
    private int red;
    private int green;
    private int blue;
    public WritingInstruments(){
        super();
    }
    public WritingInstruments(WritingInstrumentsE item, float price){
        super(price);
        this.item = item;
    }
    public WritingInstruments(WritingInstrumentsE item, int red, int green, int blue){
        super();
        this.item = item;
        this.red = (red > 255) ? 255 : red;
        this.green = (green > 255) ? 255 : green;
        this.blue = (blue > 255) ? 255 : blue;
    }
    public WritingInstruments(WritingInstrumentsE item, float price, String brand){
        super(brand, price);
        this.item = item;
    }
    public WritingInstruments(WritingInstrumentsE item, int red, int green, int blue, float price){
        super(price);
        this.item = item;
        this.red = (red > 255) ? 255 : red;
        this.green = (green > 255) ? 255 : green;
        this.blue = (blue > 255) ? 255 : blue;
    }
    public WritingInstruments(WritingInstrumentsE item, int red, int green, int blue, float price, String brand){
        super(brand, price);
        this.item = item;
        this.red = (red > 255) ? 255 : red;
        this.green = (green > 255) ? 255 : green;
        this.blue = (blue > 255) ? 255 : blue;
    }

    public void setItem(WritingInstrumentsE item) {
        this.item = item;
    }

    public WritingInstrumentsE getItem() {
        return item;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@"
                + " item: " + this.item
                + ", brand: " + this.getBrand()
                + ", price: " + this.getPrice()
                + ", color: " + red + ", " + green + ", " + blue;
    }

    @Override
    public int hashCode() {
        return super.hashCode() +
                ((item == null) ? 0 : item.hashCode()) +
                13 * (red + green + blue);
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            WritingInstruments writingInstrument = (WritingInstruments)obj;
            if (this.red != writingInstrument.red){
                return false;
            }
            if (this.green != writingInstrument.green){
                return false;
            }
            if (this.blue != writingInstrument.blue){
                return false;
            }
            if (this.item == null){
                return (this.item == writingInstrument.item);
            }
            return this.item.equals(writingInstrument.item);

        }
        return false;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    public int getRed() {
        return red;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setRed(int red) {
        this.red = red;
    }
}
