package main.java.pen.stationery;

public class Paper
extends Stationery{
    PaperE item;
    int nPages;
    public Paper(){
        super();
    }
    public Paper(PaperE item, int nPages){
        super();
        this.item = item;
        this.nPages = nPages;
    }
    public Paper(PaperE item, int nPages, float price){
        super(price);
        this.item = item;
        this.nPages = nPages;
    }
    public Paper(PaperE item, int nPages, float price, String brand){
        super(brand, price);
        this.item = item;
        this.nPages = nPages;
    }

    @Override
    public String toString() {
        return super.toString() + ", item: " + item + ", number of pages: " + nPages;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (item == null ? 0 : item.hashCode()) + 23 * nPages;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            Paper paper = (Paper)obj;
            if (paper.nPages != this.nPages){
                return false;
            }
            if (this.item == null){
                return (this.item == paper.item);
            }
            return this.item.equals(paper.item);
        }
        return false;
    }

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        this.nPages = nPages;
    }
    public void setItem(PaperE item) {
        this.item = item;
    }

    public PaperE getItem() {
        return item;
    }

}
