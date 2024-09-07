package com.quick.start.pure.java.jdk;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer("阿甘");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("阿甘执行了");
            }
        }, new Date(2024, Calendar.SEPTEMBER, 7, 13, 56, 0));

        Thread.sleep(100000);
    }
}