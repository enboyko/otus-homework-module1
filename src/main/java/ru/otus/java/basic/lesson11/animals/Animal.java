package ru.otus.java.basic.lesson11.animals;

public class Animal {
    final String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;
    static final int DEFAULT_WASTE_OF_RUNNING_ENDURANCE = 1;
    int wasteOfSwimmingEndurance;

    public String getName() {
        return name;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getWasteOfSwimmingEndurance() {
        System.out.println("This animal's waste of swimming endurance: " + wasteOfSwimmingEndurance);
        return wasteOfSwimmingEndurance;
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
        endurance -= distance * DEFAULT_WASTE_OF_RUNNING_ENDURANCE;
        if (endurance < 0) {
            System.out.println("I'm tired, bro");
            return time = -1;
        }
        time = distance / runningSpeed;
        System.out.println("I've run " + distance + " meters for " + time + " seconds\n");
        System.out.println("My current state::");
        info();
        return time;
    }

    public double swim(int distance) {
        double time;
        System.out.println("I am::");
        Animal.this.info();
        if (wasteOfSwimmingEndurance == 0) {
            System.out.println("I can't swim, bro((\n");
            return -1;
        }
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

    public void info() {
        System.out.println("Name: " + name
                + "\nRunning speed: " + runningSpeed
                + "\nSwimming speed: " + swimmingSpeed
                + "\nEndurance: " + endurance
                + "\nWaste of running endurance: " + DEFAULT_WASTE_OF_RUNNING_ENDURANCE
                + "\nWaste of swimming endurance: " + wasteOfSwimmingEndurance);
        System.out.println();
    }
}
