package com.yuhuizhao.designPattern.behavior.template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! String playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
