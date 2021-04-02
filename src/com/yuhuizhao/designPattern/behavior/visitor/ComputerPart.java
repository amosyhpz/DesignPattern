package com.yuhuizhao.designPattern.behavior.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
