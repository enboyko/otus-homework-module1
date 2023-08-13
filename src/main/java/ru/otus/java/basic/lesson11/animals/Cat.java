package ru.otus.java.basic.lesson11.animals;

public class Cat extends Animal {

    @Override
    public void setSwimmingSpeed(int swimmingSpeed) {
        System.out.println("I can't swim, bro((\n");
    }

    public Cat(String name, int runningSpeed, int endurance) {
        super(name, runningSpeed, endurance);
        this.wasteOfSwimmingEndurance = 0;
    }
}
