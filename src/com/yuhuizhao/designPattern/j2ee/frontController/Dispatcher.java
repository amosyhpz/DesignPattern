package com.yuhuizhao.designPattern.j2ee.frontController;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String request) {
        if ("STUDENT".equalsIgnoreCase(request)) {
            studentView.show();
        } else {
            homeView.show();
        }

    }
}
