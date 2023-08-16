package ru.otus.java.basic.lesson13;

import ru.otus.java.basic.lesson13.areaandtransport.*;

public class MainApp {
    public static void main(String[] args) {
        Human Ivan = new Human("Ivan");
        Car car = new Car();
        Rover rover = new Rover();
        Horse horse = new Horse();
        Bicycle bicycle = new Bicycle();

        Ivan.boardTransport(car);
        Ivan.boardTransport(car);
        Ivan.boardTransport(horse);
        System.out.println("========================");
        Ivan.leaveTransport(car);
        Ivan.leaveTransport(horse);
        System.out.println("========================");
        Ivan.move(70, AreaType.DENSE_FOREST);
        Ivan.boardTransport(car);
        Ivan.move(70, AreaType.DENSE_FOREST);
        Ivan.move(70, AreaType.PLAIN);
        System.out.println(Ivan.move(501, AreaType.PLAIN));
        System.out.println("========================");
        Ivan.leaveTransport(car);
        Ivan.boardTransport(rover);
        Ivan.move(70, AreaType.DENSE_FOREST);
        System.out.println(Ivan.move(10000, AreaType.PLAIN));
        System.out.println("========================");
        Ivan.leaveTransport(rover);
        Ivan.boardTransport(bicycle);
        Ivan.move(14, AreaType.PLAIN);
        System.out.println(Ivan.move(10000, AreaType.PLAIN));
        System.out.println("========================");
    }
}
