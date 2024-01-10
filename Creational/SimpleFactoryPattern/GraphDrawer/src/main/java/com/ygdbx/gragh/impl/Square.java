package com.ygdbx.gragh.impl;

import com.ygdbx.gragh.Graph;

public class Square extends Graph {
    @Override
    public void draw() {
        System.out.println("绘制了一个正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦出了一个正方形");
    }
}
