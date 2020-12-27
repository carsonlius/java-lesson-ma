package com.carsonlius.stagemajava.thread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadDemo {
    public static void main(String[] args) {
        // 实现r
        Thread thread = new Thread(ThreadDemo::sayHelloWorld); // 方法引用
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        System.out.println(thread.getState());
        new AtomicBoolean();
        new AtomicLong();
        new AtomicInteger();

    }

    private static void sayHelloWorld(){
        System.out.printf("线程[Id：%s], Hello World", Thread.currentThread().getId());
    }
}
