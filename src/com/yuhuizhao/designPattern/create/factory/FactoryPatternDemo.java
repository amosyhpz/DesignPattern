package com.yuhuizhao.designPattern.create.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("CIRCLE").draw();

        shapeFactory.getShape("RECTANGLE").draw();

        shapeFactory.getShape("SQUARE").draw();
    }
}
