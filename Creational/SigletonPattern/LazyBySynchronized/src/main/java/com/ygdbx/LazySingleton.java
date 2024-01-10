package com.ygdbx;

public class LazySingleton {
    private volatile static LazySingleton lazySingleton;

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            synchronized (LazySingleton.class){
                if(lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
