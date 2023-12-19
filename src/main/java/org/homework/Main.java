package org.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] myInheritedAnimals = new Animal[]{
                new Dog("Сторож", 5, false),
                new Cat("Белый", 3, true)
        };

        for (Animal animal : myInheritedAnimals) {
            Class<?> animalClass = animal.getClass();

            System.out.println("Класс: " + animalClass.getName());

            Field[] animalFields = animalClass.getDeclaredFields();
            for (Field field : animalFields) {
                field.setAccessible(true);
                try {
                    Object animalInstance = field.get(animal);
                    System.out.println("Поле: " + field.getName() + " = " + animalInstance);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            Method[] animalMethods = animalClass.getDeclaredMethods();
            for (Method method : animalMethods) {
                if (method.getName().equals("makeSound")) {
                    try {
                        method.invoke(animal);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
