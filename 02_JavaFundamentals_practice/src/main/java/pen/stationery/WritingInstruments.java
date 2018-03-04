package main.java.pen.stationery;

public class WritingInstruments
extends Stationery{
    WritingUtensils item;
    int red;
    int green;
    int blue;
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
}
