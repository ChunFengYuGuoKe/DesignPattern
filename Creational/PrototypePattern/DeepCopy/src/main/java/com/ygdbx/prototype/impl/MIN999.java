package com.ygdbx.prototype.impl;

import com.ygdbx.Lover;
import com.ygdbx.prototype.MINPrototype;

import java.io.*;

public class MIN999 implements Serializable {
    public Lover lover;

    public void setLover(Lover lover) {
        this.lover = lover;
    }

    public Lover getLover() {
        return lover;
    }

    public MIN999 deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入到流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (MIN999)objectInputStream.readObject();
    }
}
