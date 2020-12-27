package com.carsonlius.stagemajava.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryManagerMXBean;
import java.lang.management.RuntimeMXBean;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class ProcessInfoDemo {
    public static void main(String[] args) throws InterruptedException {
        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
        // 1973@bogon
        String name = runtimeMxBean.getName ();
        System.out.println("进程ID：" + name.substring(0, name.indexOf("@")));

        Instant instant = Instant.ofEpochMilli(runtimeMxBean.getStartTime());
//        LocalDate localDate = LocalDate.of(instant);
        System.out.println("启动时间:(s)" + runtimeMxBean.getStartTime() );
        System.out.println("上线时间:(ms)" + runtimeMxBean.getUptime());

        System.out.println("进程数量:" +   Thread.activeCount());


        List<MemoryManagerMXBean> memoryManagerMXBean = ManagementFactory.getMemoryManagerMXBeans();
        memoryManagerMXBean.forEach(memoryManagerMXBean1 -> {
            System.out.println(memoryManagerMXBean1);
        });


        System.exit(11);

    }
}
