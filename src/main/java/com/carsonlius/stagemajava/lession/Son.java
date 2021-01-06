package com.carsonlius.stagemajava.lession;

import java.io.Serializable;

public class Son extends Father implements Serializable {

    @Override
    public String toString() {
        return "Son{} age:" + getAge();
    }
}
