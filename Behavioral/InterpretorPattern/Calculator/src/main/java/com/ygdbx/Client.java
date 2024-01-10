package com.ygdbx;

public class Client {
    public static void main(String[] args) {
        String formula = "1 + 8 - 10 - 10000";
        CalculateHandler calculateHandler = new CalculateHandler();
        calculateHandler.handle(formula);
        int result = calculateHandler.calculate();
        System.out.println(result);
    }
}
