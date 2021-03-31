package com.yuhuizhao.designPattern.create.abstractFactory;

public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);

    public abstract Shape getShape(String shapeType);
}
