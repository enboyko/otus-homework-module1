package ru.otus.java.basic.lesson11.animals;

public class Dog extends Animal {
    final int wasteOfSwimmingEndurance = 2;


    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
    }

//    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed, int wasteOfSwimmingEndurance) {
//        super(name, runningSpeed, endurance);
//        this.swimmingSpeed = swimmingSpeed;
//        this.wasteOfSwimmingEndurance = wasteOfSwimmingEndurance;
//    }
}
