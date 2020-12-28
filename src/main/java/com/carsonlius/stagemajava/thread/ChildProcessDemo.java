package com.carsonlius.stagemajava.thread;

import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;

public class ChildProcessDemo {
    public static void main(String[] args) throws IOException {

        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println(operatingSystemMXBean.getName());
//        Runtime.getRuntime().exec("");

        if (operatingSystemMXBean.getName().startsWith("Mac")) {
            System.out.println("hello world!");
            Process process =  Runtime.getRuntime().exec("ls .");
            InputStream inputStream = process.getInputStream();

            int data = 0;
            while ((data = inputStream.read())> -1) {
                System.out.println(data);

            }


        }

    }
}
