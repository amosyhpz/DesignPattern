package com.yuhuizhao.designPattern.j2ee.interceptingFilter;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
