package com.yuhuizhao.designPattern.behavior.visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart each : parts) {
            each.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
