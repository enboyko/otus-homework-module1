package ru.otus.java.basic.lesson11.animals;

public class Horse extends Animal {

    @Override
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Horse(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
        this.wasteOfSwimmingEndurance = 4;
    }
}
