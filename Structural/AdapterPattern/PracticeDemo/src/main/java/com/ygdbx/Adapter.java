package com.ygdbx;

public class Adapter extends DbUtil{
    private final Encryptor encryptor = new Encryptor();

    @Override
    public void encrypt() {
        encryptor.encrypt();
    }
}
