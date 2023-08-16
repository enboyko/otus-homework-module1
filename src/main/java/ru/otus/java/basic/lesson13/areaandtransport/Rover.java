package ru.otus.java.basic.lesson13.areaandtransport;

public class Rover implements Transport{
    private final int gasolineTankVolume = 100;
    private final int gasolineConsumptionPerHundredMiles = 25;

    public int getGasolineTankVolume() {
        return gasolineTankVolume;
    }

    public int getGasolineConsumptionPerHundredMiles() {
        return gasolineConsumptionPerHundredMiles;
    }

    @Override
    public boolean move(int distance, AreaType areaType) {
        System.out.println("Each area is passable for a " + toString());
        int availableDistance = gasolineTankVolume / gasolineConsumptionPerHundredMiles * 100;
        if (distance > availableDistance) {
            System.out.println("Not enough gasoline for such distance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rover";
    }
}
