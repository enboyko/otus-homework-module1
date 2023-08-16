package ru.otus.java.basic.lesson13.areaandtransport;

public class Horse implements Transport {
    private final int power = 200;
    private final int powerConsumptionPerMile = 4;
    AreaType[] impassableArea = {AreaType.SWAMP};

    public int getPower() {
        return power;
    }

    public int getPowerConsumptionPerMile() {
        return powerConsumptionPerMile;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        for (AreaType type : impassableArea) {
            if (areaType == type) {
                System.out.println(areaType + " is impassable");
                return false;
            }
        }
        System.out.println(areaType + " is passable for a " + toString());
        int availableDistance = power / powerConsumptionPerMile;
        if (distance > availableDistance) {
            System.out.println("Not enough power for such distance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
