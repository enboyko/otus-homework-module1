package ru.otus.java.basic.lesson11ver2.animals;

public class Cat extends Animal {

    public Cat(String name, int runningSpeed, int endurance) {
        super(name, runningSpeed, endurance);
    }

    @Override
    public double swim(int distance) {
        System.out.println("I can't swim, bro((");
        return -1;
    }
}
