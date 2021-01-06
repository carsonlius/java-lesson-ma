package com.carsonlius.stagemajava.lession;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Father father = new Son();
        Father father = new Father();
        father.setAge(88);

        //  序列化
        FileOutputStream fileOutputStream  = new FileOutputStream("temp.o");
        ObjectOutput objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(father);

        //  反序列化
        FileInputStream fileInputStream = new FileInputStream("temp.o");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        Father f = (Father) object;

        //  由于子类没有f这个变量，是调用的父类的f变量
        System.out.println(f);

    }
}
