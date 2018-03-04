package main.java.pen.stationery;

enum PaperE {
    NOTEBOOK,
    PAPER;
}


public class Paper
extends Stationery{
    PaperE item;

    public void setItem(PaperE item) {
        this.item = item;
    }

    public PaperE getItem() {
        return item;
    }
}
