package com.ygdbx;

import com.ygdbx.prototype.MINPrototype;
import com.ygdbx.prototype.impl.MIN999;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        MIN999 min1 = new MIN999();
        min1.setLover(new Lover("jpt"));
        MIN999 min2 = null;
        try {
            min2 = min1.deepClone();
        } catch (Exception e) {
            System.out.println("克隆失败！");
        }
        System.out.println(min1.lover == min2.lover);
        System.out.println(min2.lover.name);
        System.out.println(min1.lover.name);
    }
}
