package com.carsonlius.stagemajava.lession;

public class EnumClassDemo {
    public static void main(String[] args) {
        AnimalEnum animalEnum = AnimalEnum.FISH;

        for (AnimalEnum value : AnimalEnum.values()) {
            System.out.println("value:" + value);
        }
    }
}
