package com.yuhuizhao.designPattern.create.abstractFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
