package ru.otus.java.basic.lesson13;

import ru.otus.java.basic.lesson13.areaandtransport.AreaType;
import ru.otus.java.basic.lesson13.areaandtransport.Transport;

public class Human {
    public final String name;
    private Transport currentTransport;
    public static final int POWER = 60;
    public static final int POWER_CONSUMPTION_PER_MILE = 4;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void boardTransport(Transport transport) {
        if (currentTransport != null) {
            System.out.println("I'm already on transport: " + currentTransport.toString());
            return;
        }
        currentTransport = transport;
        System.out.println("I'm boarding a transport: " + transport.toString());
    }

    public void leaveTransport(Transport transport) {
        if (currentTransport == null) {
            System.out.println("I didn't board any transport earlier - nothing to leave.\n");
            return;
        }
        System.out.println("I've left transport: " + currentTransport.toString());
        currentTransport = null;
    }

    public boolean move(int distance, AreaType areaType) {
        if (currentTransport != null) {
            System.out.println("I'm starting my movement on transport: " + currentTransport.toString());
            return (currentTransport.move(distance, areaType));
        }
        System.out.println("I didn't board any transport earlier, so I have to walk " + distance + " m.");
        return true;
    }
}
