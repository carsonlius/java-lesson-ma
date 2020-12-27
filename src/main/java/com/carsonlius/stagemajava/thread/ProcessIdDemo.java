package com.carsonlius.stagemajava.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ProcessIdDemo {
    public static void main(String[] args) {
        getProcessIdInLegacyWay();
    }

    private static void getProcessIdInLegacyWay() {
        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();

        // 1973@bogon
        String name = runtimeMxBean.getName ();
        System.out.println("进程name:" + name);
        System.out.println("进程ID：" + name.substring(0, name.indexOf("@")));
    }
}
