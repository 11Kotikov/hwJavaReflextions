package org.homework;

public class Dog extends Animal {
    private boolean isWatchdog;

    public Dog(String name, int age, boolean isWatchdog) {
        super(name, age);
        this.isWatchdog = isWatchdog;
    }

    public void makeSound() {
        System.out.println("BARK");
    }
}
