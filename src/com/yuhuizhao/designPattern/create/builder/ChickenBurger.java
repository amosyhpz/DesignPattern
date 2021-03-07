package com.yuhuizhao.designPattern.create.builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken  Burger";
    }

    @Override
    public float price() {
        return 50.0F;
    }
}
