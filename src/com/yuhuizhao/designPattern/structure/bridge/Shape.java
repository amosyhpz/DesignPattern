package com.yuhuizhao.designPattern.structure.bridge;

public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
