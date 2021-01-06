package com.carsonlius.stagemajava.lession;

public class Father {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "age=" + age +
                '}';
    }
}
