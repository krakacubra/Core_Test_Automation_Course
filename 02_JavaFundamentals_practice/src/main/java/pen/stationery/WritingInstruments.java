package main.java.pen.stationery;

public class WritingInstruments
extends Stationery{
    private WritingUtensils item;
    private int red;
    private int green;
    private int blue;
    public WritingInstruments(){
        super();
    }
    public WritingInstruments(WritingUtensils item, float price){
        super(price);
        this.item = item;
    }
    public WritingInstruments(WritingUtensils item, float price, String brand){
        super(brand, price);
        this.item = item;
    }
    public WritingInstruments(WritingUtensils item, float price, int red, int green, int blue){
        super(price);
        this.item = item;
        if(red > 255){
            this.red = 255;
        } else {
            this.red = red;
        }
        if(green > 255){
            this.green = 255;
        } else {
            this.green = green;
        }
        if(blue > 255){
            this.blue = 255;
        } else {
            this.blue = blue;
        }
    }
    public WritingInstruments(WritingUtensils item, float price, int red, int green, int blue, String brand){
        super(brand, price);
        this.item = item;
        if(red > 255){
            this.red = 255;
        } else {
            this.red = red;
        }
        if(green > 255){
            this.green = 255;
        } else {
            this.green = green;
        }
        if(blue > 255){
            this.blue = 255;
        } else {
            this.blue = blue;
        }
    }

    public void setItem(WritingUtensils item) {
        this.item = item;
    }

    public WritingUtensils getItem() {
        return item;
    }

    @Override
    public String toString() {
        return super.toString() + "item: " + item +
                "color: " + red + ", " + green + ", " + blue;
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
