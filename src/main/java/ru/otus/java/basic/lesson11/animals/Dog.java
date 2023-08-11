package ru.otus.java.basic.lesson11.animals;

public class Dog extends Animal {

    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
        this.wasteOfSwimmingEndurance = 2;
    }
}
