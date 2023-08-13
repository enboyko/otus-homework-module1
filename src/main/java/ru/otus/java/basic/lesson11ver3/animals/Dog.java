package ru.otus.java.basic.lesson11ver3.animals;

public class Dog extends Animal {
    final int wasteOfSwimmingEndurance = 2;

    @Override
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public int getWasteOfSwimmingEndurance() {
        return wasteOfSwimmingEndurance;
    }

    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
    }
}
