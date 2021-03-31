package com.yuhuizhao.designPattern.create.singleton.lazy;

/**
 * 懒汉式，线程安全，性能有问题（较多）
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
