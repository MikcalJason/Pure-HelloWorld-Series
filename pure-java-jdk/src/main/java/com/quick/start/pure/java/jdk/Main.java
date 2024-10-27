package com.quick.start.pure.java.jdk;

import sun.misc.Unsafe;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    //原子性

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer("阿甘");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("阿甘执行了");
            }
        }, new Date(2024, Calendar.SEPTEMBER, 7, 13, 56, 0));

        AtomicInteger i2 = new AtomicInteger(0);
        i2.compareAndSet(0, 2);
        AtomicReference<String> atomicReference = new AtomicReference<>("hello");
        atomicReference.compareAndSet("hello", "world");
        Thread.sleep(100000);

        Thread t = new Thread();
    }
}