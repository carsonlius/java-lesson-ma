package com.carsonlius.stagemajava.lession;

public enum AnimalEnum {
    PERSON("hello"), FISH("world");
    private String desc;

    AnimalEnum(String desc) {
        this.desc = desc;
    }
}
