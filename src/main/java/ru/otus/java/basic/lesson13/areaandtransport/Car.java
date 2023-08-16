package ru.otus.java.basic.lesson13.areaandtransport;

public class Car implements Transport {
    private final int gasolineTankVolume = 50;
    private final int gasolineConsumptionPerHundredMiles = 10;
    AreaType[] impassableArea = {AreaType.DENSE_FOREST, AreaType.SWAMP};

    public int getGasolineTankVolume() {
        return gasolineTankVolume;
    }

    public int getGasolineConsumptionPerHundredMiles() {
        return gasolineConsumptionPerHundredMiles;
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
        int availableDistance = gasolineTankVolume / gasolineConsumptionPerHundredMiles * 100;
        if (distance > availableDistance) {
            System.out.println("Not enough gasoline for such distance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car";
    }
}
