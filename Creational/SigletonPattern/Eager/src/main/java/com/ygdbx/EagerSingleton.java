package com.ygdbx;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton= new EagerSingleton();

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
