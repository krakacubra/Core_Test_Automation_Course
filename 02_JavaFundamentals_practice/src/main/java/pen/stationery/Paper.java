package main.java.pen.stationery;

import main.java.pen.stationery.enums.PaperE;

public class Paper extends Stationery{
    private PaperE item;
    private int numberPages;

    public Paper(){
        super();
    }

    public Paper(PaperE item, int numberPages){
        super();
        this.item = item;
        this.numberPages = numberPages;
    }

    public Paper(PaperE item, int numberPages, float price){
        super(price);
        this.item = item;
        this.numberPages = numberPages;
    }

    public Paper(PaperE item, int numberPages, float price, String brand){
        super(brand, price);
        this.item = item;
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return super.toString() + ", item: " + item + ", number of pages: " + numberPages;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (item == null ? 0 : item.hashCode()) + 23 * numberPages;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            Paper paper = (Paper)obj;
            if (paper.numberPages != this.numberPages){
                return false;
            }
            if (this.item == null){
                return (this.item == paper.item);
            }
            return this.item.equals(paper.item);
        }
        return false;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setItem(PaperE item) {
        this.item = item;
    }

    public PaperE getItem() {
        return item;
    }

}
