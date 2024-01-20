package com.ygdbx.prototype;

import com.ygdbx.Lover;

import java.util.List;
//Todo 为啥这里在MIN999上加一层抽象就会克隆失败？
public abstract class MINPrototype {
    public Lover lover;

    public void setLover(Lover lover) {
        this.lover = lover;
    }

    public Lover getLover() {
        return lover;
    }

    public abstract MINPrototype deepClone();
}
