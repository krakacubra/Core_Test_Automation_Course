package main.java.pen.stationery;

import main.java.pen.Pen;

import java.util.Comparator;

/**
 *
 */
public class Stationery {

    private String brand;
    private float price;

    public Stationery(){
        price = 0.0F;
    }
    public Stationery(String brand){
        this.brand = brand;
    }
    public Stationery(String brand, float price){
        this.brand = brand;
        this.price = price;
    }
    public Stationery(float price){
        this.price = price;
    }
    @Override
    public int hashCode() {
        return (int)(12 * price) + ((brand == null) ? 0 : brand.hashCode());
    }

    @Override
    public String toString() {
        return getClass().getName() + "@"
                + " price: " + price
                + ", brand: " + brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (null == obj){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Stationery pen = (Stationery) obj;
        if(this.price != pen.price){
            return false;
        }
        if(null == this.brand){
            return (this.brand == pen.brand);
        }
        else if(!this.brand.equals(pen.brand)){
            return false;
        }
        return true;
    }
}
