package ru.otus.java.basic.lesson11ver3;

import ru.otus.java.basic.lesson11ver3.animals.Animal;
import ru.otus.java.basic.lesson11ver3.animals.Cat;
import ru.otus.java.basic.lesson11ver3.animals.Dog;
import ru.otus.java.basic.lesson11ver3.animals.Horse;

public class MainApp {
    public static void main(String[] args) {
        Animal murzik = new Cat("Murzik", 5,100);
        murzik.run(100);
        murzik.run(500);
        System.out.println("================================");
        murzik.swim(20);
        murzik.setSwimmingSpeed(50);
        System.out.println("================================");
        System.out.println("================================");
        Animal sharik = new Dog("Sharik", 10, 150,2);
        sharik.swim(70);
        sharik.run(2);
        System.out.println("================================");
        System.out.println("================================");
        Animal buzefal = new Horse("Buzefal", 60, 300,2);
        buzefal.swim(70);
        buzefal.run(2);
    }
}
