package com.ygdbx;

public class Client {
    public static void main(String[] args) {
        DbUtil dbUtil = new Adapter();
        dbUtil.encrypt();
    }
}
