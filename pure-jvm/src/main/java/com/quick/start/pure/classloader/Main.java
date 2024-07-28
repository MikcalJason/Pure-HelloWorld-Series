package com.quick.start.pure.classloader;


import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * SPI、ClassLoader
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Driver dirver = iterator.next();
            System.out.println(dirver.getClass() + ", 类加载器：" + dirver.getClass().getClassLoader());
        }
        System.out.println("当前线程上线文类加载器：" + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader类加载器：" + loader.getClass().getClassLoader());
    }
}