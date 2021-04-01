package com.yuhuizhao.designPattern.structure.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
