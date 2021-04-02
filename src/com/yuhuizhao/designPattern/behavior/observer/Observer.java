package com.yuhuizhao.designPattern.behavior.observer;

public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
