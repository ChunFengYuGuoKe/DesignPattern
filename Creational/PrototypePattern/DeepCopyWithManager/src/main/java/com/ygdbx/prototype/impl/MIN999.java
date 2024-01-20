package com.ygdbx.prototype.impl;

import com.ygdbx.Lover;
import com.ygdbx.prototype.MINPrototype;

import java.io.*;

public class MIN999 extends MINPrototype implements Serializable {
    private Lover lover;

    @Override
    public void love() {
        System.out.println("I love " + getLover().name);
    }

    public Lover getLover() {
        return lover;
    }

    public void setLover(Lover lover) {
        this.lover = lover;
    }

    @Override
    public MINPrototype deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (MINPrototype) ois.readObject();
    }
}
