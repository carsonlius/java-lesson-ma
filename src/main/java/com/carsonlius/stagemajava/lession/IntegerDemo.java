package com.carsonlius.stagemajava.lession;

public class IntegerDemo {
    public static void main(String[] args) {
        // 反向编译一下可以看到,自动打包的时候实际调用了Integer.valueOf(127);
        // 对比较的数值采用了缓存了实例
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        Integer.valueOf(127);
        System.out.println("x == y: " + (x==y)); // true
        System.out.println("m == n: " + (m==n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true
    }
}
