package com.carsonlius.stagemajava.lession;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <10 ; i++) {
            stringBuffer.append(',').append(i);
        }

        System.out.println(stringBuffer.toString());

//        new Integer();
    }
}
