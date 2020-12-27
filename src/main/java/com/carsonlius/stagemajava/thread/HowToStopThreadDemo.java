package com.carsonlius.stagemajava.thread;

import java.util.concurrent.Executors;

public class HowToStopThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        StoppableAction stoppableAction = new StoppableAction();
        Thread thread = new Thread(stoppableAction);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());

        // 线程池, 上述方案可能出现问题
//        Executors.newFixedThreadPool(2); // 两个线程复用
//        Executors.newCachedThreadPool(); // 弹性的申请线程

        thread.interrupt();

    }


    private static class StoppableAction implements Runnable {
        // 原子操作
        private volatile boolean stopped;

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            if (stopped) {
                // 通过异常的方式，绝对可以kill线程（即使是线程池也不能继续了, 是jvm级别的）
                System.out.println("Action 中指操作 Thread:" + threadName);

                return;
            }
            System.out.println("Action执行 ... Thread:" + threadName);
        }

        public void stop(){
            stopped = true;
        }
    }
}
