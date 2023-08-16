package ru.otus.java.basic.lesson13.areaandtransport;

import ru.otus.java.basic.lesson13.Human;

public class Bicycle implements Transport {
    AreaType[] impassableArea = {AreaType.SWAMP};

    @Override
    public boolean move(int distance, AreaType areaType) {
        for (AreaType type : impassableArea) {
            if (areaType == type) {
                System.out.println(areaType + " is impassable");
                return false;
            }
        }
        System.out.println(areaType + " is passable for a " + toString());
        int availableDistance = Human.POWER / Human.POWER_CONSUMPTION_PER_MILE;
        if (distance > availableDistance) {
            System.out.println("Not enough power for such distance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bicycle";
    }
}
