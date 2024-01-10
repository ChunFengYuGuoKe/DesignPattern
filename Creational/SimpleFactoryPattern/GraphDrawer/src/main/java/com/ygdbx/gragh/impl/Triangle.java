package com.ygdbx.gragh.impl;

import com.ygdbx.gragh.Graph;

public class Triangle extends Graph {
    @Override
    public void draw() {
        System.out.println("绘制了一个三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦出了一个三角形");
    }
}
