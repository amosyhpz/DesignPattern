package com.yuhuizhao.designPattern.create.singleton.hungry;

/**
 * 饿汉式，线程安全
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {

        return instance;
    }
}
