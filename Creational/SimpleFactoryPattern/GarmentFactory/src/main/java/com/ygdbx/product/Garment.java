package com.ygdbx.product;

public abstract class Garment {
    protected String color;
    protected String style;
    protected int price;

    public abstract void sale();

    public Garment(String color, String style, int price) {
        this.color = color;
        this.style = style;
        this.price = price;
    }
}
