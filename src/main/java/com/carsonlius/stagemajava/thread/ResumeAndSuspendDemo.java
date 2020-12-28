package com.carsonlius.stagemajava.thread;

public class ResumeAndSuspendDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(ResumeAndSuspendDemo::sayHelloWorld);

        thread.start();
        synchronized (ResumeAndSuspendDemo.class) {
            thread.resume();
        }
        System.out.printf("%s is over \n", Thread.currentThread().getName());

    }

    private static void sayHelloWorld()
    {
        Object monitor = ResumeAndSuspendDemo.class;
        synchronized (monitor) {
            try {
                Thread.currentThread().suspend();
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("线程[%s] 恢复执行: <==============> Hello World!\n", Thread.currentThread().getName());
        }
    }

}
