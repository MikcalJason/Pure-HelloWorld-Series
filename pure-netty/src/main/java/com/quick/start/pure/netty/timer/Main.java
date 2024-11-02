package com.quick.start.pure.netty.timer;


import io.netty.util.HashedWheelTimer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HashedWheelTimer timer = new HashedWheelTimer(1, TimeUnit.SECONDS, 60);
        timer.newTimeout(timeout -> System.out.println("执行了"), 2, TimeUnit.SECONDS);
        Thread.sleep(5000);
    }
}