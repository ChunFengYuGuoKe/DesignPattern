package com.ygdbx;

import com.ygdbx.gragh.Graph;
import com.ygdbx.gragh.impl.Circle;
import com.ygdbx.gragh.impl.Square;
import com.ygdbx.gragh.impl.Triangle;

public class Drawer {
    public static Graph draw(String graphName) {
        if(graphName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (graphName.equalsIgnoreCase("square")) {
            return new Square();
        } else if (graphName.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}
