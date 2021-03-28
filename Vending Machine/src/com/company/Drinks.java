package com.company;

public class Drinks {
    private Cola cola;
    private Pepsi pepsi;
    private Sprite sprite;



    public Drinks(){}

    public Drinks(Cola cola, Pepsi pepsi, Sprite sprite) {
        this.cola = cola;
        this.pepsi = pepsi;
        this.sprite = sprite;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public Pepsi getPepsi() {
        return pepsi;
    }

    public void setPepsi(Pepsi pepsi) {
        this.pepsi = pepsi;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
}
