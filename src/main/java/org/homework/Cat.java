package org.homework;

public class Cat extends Animal {
    private boolean isFluffy;

    public Cat(String name, int age, boolean isFluffy) {
        super(name, age);
        this.isFluffy = isFluffy;
    }

}
