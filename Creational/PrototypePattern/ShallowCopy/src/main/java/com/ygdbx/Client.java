package com.ygdbx;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        RobotPrototype min100 = new RobotPrototype("MIN100", 250, new ArrayList());
        try {
            RobotPrototype min100Cloned = (RobotPrototype)min100.clone();
            System.out.println("机器人是否为同一个：" + (min100 == min100Cloned));
            System.out.println("型号是否相同：" + (min100.type == min100Cloned.type));
            System.out.println("IQ是否相同：" + (min100.IQ == min100Cloned.IQ));
            System.out.println("零件是否相同：" + (min100.Components == min100Cloned.Components));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
