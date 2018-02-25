package penExercise.main.java.pen;

public class Pen
{
    private String brand;
    private int red;
    private int green;
    private int blue;
    private float price;

    public Pen(){
        brand = "anon";
        red = 0;
        green = 0;
        blue = 0;
        price = 0.0F;
    }
    public Pen(String brand, int red, int green, int blue){
        this.brand = brand;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Pen(String brand, int red, int green, int blue, float price){
        this.brand = brand;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@"
                + " price: " + price
                + ", Brand: " + brand
                + ", color: "
                + red + ", " + green + ", " +  blue;
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
        Pen pen = (Pen)obj;
        if(this.price != pen.price){
            return false;
        }
        if(this.red != red){
            return false;
        }
        if(this.green != green){
            return false;
        }
        if(this.blue != blue){
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

    @Override
    public int hashCode(){
            return (int)(31*price + ((null == brand)
                    ? 0 : brand.hashCode()));
        }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public Integer getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public Integer getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
