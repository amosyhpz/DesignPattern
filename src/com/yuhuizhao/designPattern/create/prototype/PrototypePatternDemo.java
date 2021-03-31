package com.yuhuizhao.designPattern.create.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        System.out.println(ShapeCache.getShape("1").getType());
        System.out.println(ShapeCache.getShape("2").getType());
        System.out.println(ShapeCache.getShape("3").getType());

    }
}
