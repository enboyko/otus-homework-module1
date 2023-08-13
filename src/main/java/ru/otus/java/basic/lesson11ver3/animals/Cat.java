package ru.otus.java.basic.lesson11ver3.animals;

public class Cat extends Animal {
    final int wasteOfSwimmingEndurance = 0;

    @Override
    public void setSwimmingSpeed(int swimmingSpeed) {
        System.out.println("I can't swim, bro((\n");
    }

    @Override
    public int getWasteOfSwimmingEndurance() {
        return wasteOfSwimmingEndurance;
    }

    public Cat(String name, int runningSpeed, int endurance) {
        super(name, runningSpeed, endurance);
    }
}
