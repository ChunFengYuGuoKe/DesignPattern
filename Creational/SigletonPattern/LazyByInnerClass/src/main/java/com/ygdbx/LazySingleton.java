package com.ygdbx;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private static class holder{
        private static final LazySingleton lazySingleton= new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return holder.lazySingleton;
    }
}
