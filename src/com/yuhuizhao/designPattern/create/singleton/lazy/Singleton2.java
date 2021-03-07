package com.yuhuizhao.designPattern.create.singleton.lazy;

/**
 * 懒汉式，线程安全，性能有问题（较少）
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
