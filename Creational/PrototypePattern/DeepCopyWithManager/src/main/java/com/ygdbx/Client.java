package com.ygdbx;

import com.ygdbx.prototype.MINPrototype;
import com.ygdbx.prototype.impl.MIN999;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        MINPrototype min1 = new MIN999();
        min1.setLover(new Lover("jpt"));
        MINPrototype min2;
        try {
            min2 = min1.deepCopy();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(min1 == min2);
        System.out.println(min1.getLover() == min2.getLover());
        System.out.println(min1.getLover());
        System.out.println(min2.getLover());
    }
}
