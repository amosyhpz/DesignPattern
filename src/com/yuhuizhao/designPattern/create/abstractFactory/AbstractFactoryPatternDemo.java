package com.yuhuizhao.designPattern.create.abstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("RECTANGLE").draw();
        shapeFactory.getShape("SQUARE").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        colorFactory.getColor("RED").fill();
        colorFactory.getColor("GREEN").fill();
        colorFactory.getColor("BLUE").fill();

    }
}
