package com.carsonlius.stagemajava.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class SynchronizedPerformanceDemo {
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        List integerList = new ArrayList<>();

            testAdd(vector);
            testAdd(integerList);
    }

    private static void testAdd(List arrayList){
        doTest(1000000, arrayList);
    }

    private static void testAdd(Vector vector){
        doTest(1000000, vector);
    }

    private static void doTest(int count, List list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(new Object());
        }

        long costTime = System.currentTimeMillis() - startTime;
        System.out.printf("%s add costs %s ms \n", list.getClass().getCanonicalName(), costTime);
    }
}
