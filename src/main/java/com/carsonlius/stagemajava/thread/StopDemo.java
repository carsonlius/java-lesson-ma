package com.carsonlius.stagemajava.thread;

public class StopDemo {
    public static void main(String[] args) {
        final Object lock = new Object();

        try {
            Thread t0 = new Thread(() -> {
                try {
                    synchronized (lock) {
                        System.out.println("thread->" + Thread.currentThread().getName()
                                + " acquire lock.");
                        // sleep for 3s
                        Thread.sleep(3000);
                        System.out.println("thread->" + Thread.currentThread().getName()
                                + " release lock.");
                    }
                } catch (Throwable ex) {
                    System.out.println("Caught in run: " + ex);
                    ex.printStackTrace();
                }
            });

            Thread t1 = new Thread(() -> {
                synchronized (lock) {
                    System.out.println("thread->" + Thread.currentThread().getName()
                            + " acquire lock.");
                }
            });

            t0.start();
            Thread.sleep(1000);
            t0.stop();
            t1.start();
        } catch (Throwable e) {
            System.out.println("Caught in main: " + e);
            e.printStackTrace();
        }
    }
}
