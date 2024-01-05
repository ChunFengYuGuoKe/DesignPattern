package com.ygdbx;

public class Client {
    public static void main(String[] args) {
        String instruction = "up move 5 and left run 100 and up run 10000";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
