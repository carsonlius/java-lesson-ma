package com.carsonlius.stagemajava.thread;

public class ThreadInterruptDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(ThreadInterruptDemo::sayHelloWorld);
        System.out.println("build state:" + thread.getState());
        thread.start();
        System.out.println("start state:" + thread.getState());
        thread.interrupt();

        thread.join();
        System.out.println("join state:" + thread.getState());


        System.out.println("------------------------> Next");
        System.out.println(thread.getState());
    }

    public static void sayHelloWorld() {
        Object monitor = ThreadInterruptDemo.class;
        synchronized (monitor) {
            try {
                monitor.wait(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        if (Thread.currentThread().isInterrupted()) {
            System.out.printf("线程[Id:%s] 被终止\n", Thread.currentThread().getId());
            return;
        }
        System.out.printf("线程[Id:%s] : Hello World\n", Thread.currentThread().getId());
    }
}
