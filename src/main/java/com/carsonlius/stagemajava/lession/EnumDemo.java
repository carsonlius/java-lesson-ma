package com.carsonlius.stagemajava.lession;

public class EnumDemo {
    enum Color { RED, BLACK, WHIT};
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color.compareTo(Color.BLACK));
        System.out.println(Color.RED);
    }
}
