package ru.otus.java.basic.lesson11.animals;

public class Dog extends Animal {

    @Override
    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
        this.wasteOfSwimmingEndurance = 2;
    }
}
