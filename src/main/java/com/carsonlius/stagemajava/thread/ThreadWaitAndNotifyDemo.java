package com.carsonlius.stagemajava.thread;

public class ThreadWaitAndNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(ThreadWaitAndNotifyDemo::sayHelloWorld);
        thread.setName("T1");
        thread.start();


        Thread thread1 = new Thread(ThreadWaitAndNotifyDemo::sayHelloWorld);
        thread1.setName("T2");
        thread1.start();


        // 调用notify方法的对象必须和wait是同一个
        Object monitor = ThreadWaitAndNotifyDemo.class;
        synchronized (monitor) {
            monitor.notify();
        }

//        thread.join();         // 等待线程结束
        System.out.println("Hello next ------->");

    }

    private static void sayHelloWorld()
    {
        Object monitor = ThreadWaitAndNotifyDemo.class;
        synchronized (monitor) {
            try {
                System.out.printf("线程【%s】<--------------->进入等待状态 \n", Thread.currentThread().getName());
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("线程[%s] 恢复执行: <==============> Hello World!\n", Thread.currentThread().getName());
        }
    }
}
