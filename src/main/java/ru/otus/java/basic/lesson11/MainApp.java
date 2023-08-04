package ru.otus.java.basic.lesson11;

import ru.otus.java.basic.lesson11.animals.Animal;
import ru.otus.java.basic.lesson11.animals.Cat;
import ru.otus.java.basic.lesson11.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
//        Animal murzik = new Cat("Murzik", 5,100);
//        murzik.run(100);
//        murzik.run(500);
//        System.out.println("================================");
//        murzik.swim(100);
//        System.out.println("================================");
//        System.out.println("================================");
        Animal sharik = new Dog("Sharik", 10, 150,2);
        sharik.swim(70);

    }
}
