package ru.otus.java.basic.lesson11ver2.animals;

public abstract class Animal {
    final String name;
    final int runningSpeed;
    int swimmingSpeed;
    int endurance;
    final int wasteOfRunningEndurance = 1;
    int wasteOfSwimmingEndurance;

    public String getName() {
        return name;
    }

    public Animal(String name, int runningSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.endurance = endurance;
    }

    public double run(int distance) {
        double time;
        System.out.println("I am::");
        Animal.this.info();
        endurance -= distance * wasteOfRunningEndurance;
        if (endurance < 0) {
            System.out.println("I'm tired, bro");
            return time = -1;
        }
        time = distance / runningSpeed;
        System.out.println("I've run " + distance + " meters for " + time + " seconds\n");
        System.out.println("My current state::");
        Animal.this.info();
        return time;
    }

    public abstract double swim(int distance);

    public void info() {
        System.out.println("Name: " + name
                + "\nRunning speed: " + runningSpeed
                + "\nSwimming speed: " + swimmingSpeed
                + "\nEndurance: " + endurance
                + "\nWaste of running endurance: " + wasteOfRunningEndurance
                + "\nWaste of swimming endurance: " + wasteOfSwimmingEndurance);
        System.out.println();
    }
}
