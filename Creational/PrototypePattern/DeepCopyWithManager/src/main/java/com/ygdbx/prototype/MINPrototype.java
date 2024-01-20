package com.ygdbx.prototype;

import com.ygdbx.Lover;
import com.ygdbx.prototype.impl.MIN999;

import java.io.*;

//Todo 为啥这里在MIN999上加一层抽象就会克隆失败？我怀疑是因为读取对象的时候会调用构造方法
//但是因为MINPrototype是个抽象类，所以没办法正确创建对象
public abstract class MINPrototype {

    public abstract void love();
    /*public Lover getLover(){
        return lover;
    }

    public void setLover(Lover lover){
        this.lover = lover;
    }

    public MINPrototype deepCopy() throws IOException, ClassNotFoundException{
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (MINPrototype) ois.readObject();
    }*/
    public abstract Lover getLover();

    public abstract void setLover(Lover lover);

    public abstract MINPrototype deepCopy() throws IOException, ClassNotFoundException;
}
