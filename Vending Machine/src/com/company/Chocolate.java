package com.company;

public class Chocolate {
    private Mars mars;
    private Snickers snickers;
    private Baunti baunti;

    public Chocolate(){}

    public Chocolate(Mars mars, Snickers snickers, Baunti baunti) {
        this.mars = mars;
        this.snickers = snickers;
        this.baunti = baunti;
    }

    public Mars getMars() {
        return mars;
    }

    public void setMars(Mars mars) {
        this.mars = mars;
    }

    public Snickers getSnickers() {
        return snickers;
    }

    public void setSnickers(Snickers snickers) {
        this.snickers = snickers;
    }

    public Baunti getBaunti() {
        return baunti;
    }

    public void setBaunti(Baunti baunti) {
        this.baunti = baunti;
    }
}
