package com.yuhuizhao.designPattern.create.singleton.lazy;

/**
 * 懒汉式，线程安全，性能有问题（较少）
 */
public class Singleton3 {
    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    private Singleton3() {
    }


    public static final Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
