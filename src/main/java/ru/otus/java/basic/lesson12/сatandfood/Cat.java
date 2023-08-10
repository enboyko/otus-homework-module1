package ru.otus.java.basic.lesson12.сatandfood;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety; //сытость

    public String getName() {
        return name;
    }

    public int getAppetite() {
        System.out.println(appetite);
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        satiety = plate.reduceFood(appetite);
        if (satiety) {
            System.out.println("I'm " + name + ". I'm full and food was enough for me");
        } else {
            System.out.println("I'm " + name + ". I'm still hungry ((");
        }
    }

    public void info() {
        System.out.println("Name: " + name
                + "\nMy appetite equals: " + appetite
                + "\nAm I full? " + satiety);
    }
}
