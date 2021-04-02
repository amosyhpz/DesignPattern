package com.yuhuizhao.designPattern.behavior.nullObject;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String each : names) {
            if (each.equalsIgnoreCase(name)) {
                return new RealCustomer(each);
            }
        }
        return new NullCustomer();
    }
}
