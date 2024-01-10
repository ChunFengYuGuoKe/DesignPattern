package com.ygdbx.product.conceteproduct;

import com.ygdbx.product.Garment;

public class Shoes extends Garment {
    public Shoes(String color, String style, int price) {
        super(color, style, price);
    }

    @Override
    public void sale() {
        System.out.println("一件风格为" + style + ", 颜色为" + color + "的鞋子, 售价为" + price);
    }
}
