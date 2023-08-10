package ru.otus.java.basic.lesson12.сatandfood;

public class Plate {
    private final int maxFoodAmount;
    private int currentFoodAmount;

    public int getMaxFoodAmount() {
        return maxFoodAmount;
    }

    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public Plate(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = maxFoodAmount;
    }

    public void addFood(int food) {
        int difference = maxFoodAmount - currentFoodAmount;
        if (food > difference) {
            currentFoodAmount = maxFoodAmount;
            System.out.println("Plate is full\n");
            return;
        }
        currentFoodAmount += food;
        System.out.println("They have add " + food + " units of food");
    }

    public boolean reduceFood(int amount) {
        if (currentFoodAmount < amount) {
            return false;
        }
        currentFoodAmount -= amount;
        System.out.println("Someone has eaten " + amount + " units of food ...");
        return true;
    }

    public void info() {
        System.out.println("Maximum plate capacity: " + maxFoodAmount
                + "\nCurrent food amount in the plate: " + currentFoodAmount
                + "\n");
    }
}
