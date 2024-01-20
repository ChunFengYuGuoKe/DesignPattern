package com.ygdbx;

import java.util.List;

public class RobotPrototype implements Cloneable{
    public String type;

    public int IQ;

    public List Components;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public RobotPrototype(String type, int IQ, List components) {
        this.type = type;
        this.IQ = IQ;
        Components = components;
    }
}
