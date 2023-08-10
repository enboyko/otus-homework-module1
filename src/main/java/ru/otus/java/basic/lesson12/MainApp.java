package ru.otus.java.basic.lesson12;

import ru.otus.java.basic.lesson12.сatandfood.Cat;
import ru.otus.java.basic.lesson12.сatandfood.Plate;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 30),
                new Cat("Vaska", 20),
                new Cat("Obzhora", 1000)
        };
        Plate commonPlate = new Plate(150);
        for (Cat i : cats) {
            i.eat(commonPlate);
        }
        commonPlate.info();

        // ==================================================================
        // Tests:
//        Cat muska = new Cat("Muska", 50);
//        muska.info();
//        System.out.println("==================================");
//        Plate plate1 = new Plate(150);
//        plate1.info();
//        plate1.reduceFood(50);
//        plate1.info();
//        plate1.addFood(30);
//        plate1.info();
//        plate1.addFood(30);
//        plate1.info();
//        System.out.println("==================================");
//        muska.eat(plate1);
//        muska.info();
//        plate1.info();
//        muska.eat(plate1);
//        muska.info();
//        plate1.info();
//        muska.eat(plate1);
//        muska.info();
//        plate1.info();
//        muska.eat(plate1);
//        muska.info();
//        plate1.info();
//        System.out.println("==================================");
//        plate1.addFood(120);
//        plate1.info();
//        System.out.println("======");
//        plate1.addFood(300);
//        plate1.info();
//        System.out.println("==================================");
//        plate1.reduceFood(140);
//        plate1.info();
//        plate1.reduceFood(500);
//        plate1.info();
//        System.out.println("==================================");
    }
}
