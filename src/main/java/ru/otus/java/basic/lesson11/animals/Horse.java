package ru.otus.java.basic.lesson11.animals;

public class Horse extends Animal {
    final int wasteOfSwimmingEndurance = 4;

    @Override
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public int getWasteOfSwimmingEndurance() {
        return wasteOfSwimmingEndurance;
    }

    public Horse(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
    }
}
