package com.ygdbx;

import com.ygdbx.gragh.Graph;

public class client {
    public static void main(String[] args) {
        String type = XMLUtil.getType();

        if (type != null) {
            Graph graph = Drawer.draw(type);
            if (graph != null) {
                graph.draw();
                graph.erase();
            }
        }
    }
}
