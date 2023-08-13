package ru.otus.java.basic.lesson11ver3.animals;

public abstract class Animal {
    final String name;
    int runningSpeed;
    int swimmingSpeed;
    int endurance;
    final int wasteOfRunningEndurance = 1;

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

    public abstract void setSwimmingSpeed(int swimmingSpeed);

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getWasteOfRunningEndurance() {
        return wasteOfRunningEndurance;
    }

    public abstract int getWasteOfSwimmingEndurance();

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

    public double swim(int distance) {
        double time;
        System.out.println("I am::");
        Animal.this.info();
        if (this.getWasteOfSwimmingEndurance() == 0) {
            System.out.println("I can't swim, bro((\n");
            return -1;
        }
        endurance -= distance * this.getWasteOfSwimmingEndurance();
        if (endurance < 0) {
            System.out.println("I'm tired, bro");
            return time = -1;
        }
        time = distance / swimmingSpeed;
        System.out.println("I've swum " + distance + " meters for " + time + " seconds\n");
        System.out.println("My current state::");
        Animal.this.info();
        return time;
    }

    public void info() {
        System.out.println("Name: " + name
                + "\nRunning speed: " + runningSpeed
                + "\nSwimming speed: " + swimmingSpeed
                + "\nEndurance: " + endurance
                + "\nWaste of running endurance: " + wasteOfRunningEndurance
                + "\nWaste of swimming endurance: " + this.getWasteOfSwimmingEndurance());
        System.out.println();
    }
}
