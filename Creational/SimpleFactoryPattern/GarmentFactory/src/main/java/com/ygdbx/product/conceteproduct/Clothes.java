package com.ygdbx.product.conceteproduct;

import com.ygdbx.product.Garment;

public class Clothes extends Garment {
    @Override
    public void sale() {
        System.out.println("一件风格为" + style + ", 颜色为" + color + "的衣服, 售价为" + price);
    }
    public Clothes(String color, String style, int price) {
        super(color, style, price);
    }
}
