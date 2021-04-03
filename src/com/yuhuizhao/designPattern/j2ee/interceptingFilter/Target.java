package com.yuhuizhao.designPattern.j2ee.interceptingFilter;

public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
