package com.carsonlius.stagemajava.lession;

import java.io.Serializable;
import java.util.Random;

public class JavaBeanDemo implements Serializable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan(){
        Random random  = new Random(47);
        int randomInt = random.nextInt(100);
        return randomInt > 50;
    }

    public static void main(String[] args) {

    }
}
