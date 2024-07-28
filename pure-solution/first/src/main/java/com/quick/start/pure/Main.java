package com.quick.start.pure;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 128;
        int len = 14;
        System.out.println(i % len);
        System.out.println(i & len - 1);
    }
}