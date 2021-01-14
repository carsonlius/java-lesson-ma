package com.carsonlius.stagemajava.thread;

public class SynchronizedObjectAndClassDemo {
    public static void main(String[] args) {
        echo("Hello,World");
        doEcho("Hello,Boys");
    }

    private static void doEcho(String message)
    {
        Object objectStatic = SynchronizedObjectAndClassDemo.class;
        Object object = new Object();

        synchronized (object) {
            echo(message);
        }
    }

    private static synchronized void echo(String message){
        System.out.println(message);
    }
}
