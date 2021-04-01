package com.yuhuizhao.designPattern.structure.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
