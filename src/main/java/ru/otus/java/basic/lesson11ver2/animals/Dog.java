package ru.otus.java.basic.lesson11ver2.animals;

public class Dog extends Animal {
    final int wasteOfSwimmingEndurance = 2;


    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed) {
        super(name, runningSpeed, endurance);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public double swim(int distance) {
        double time;
        System.out.println("I am::");
        info();
        endurance -= distance * wasteOfSwimmingEndurance;
        if (endurance < 0) {
            System.out.println("I'm tired, bro");
            return time = -1;
        }
        time = distance / swimmingSpeed;
        System.out.println("I've swum " + distance + " meters for " + time + " seconds\n");
        System.out.println("My current state::");
        info();
        return time;
    }
}

//    public Dog(String name, int runningSpeed, int endurance, int swimmingSpeed, int wasteOfSwimmingEndurance) {
//        super(name, runningSpeed, endurance);
//        this.swimmingSpeed = swimmingSpeed;
//        this.wasteOfSwimmingEndurance = wasteOfSwimmingEndurance;
//    }
