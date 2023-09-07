package ru.otus.java.basic.lesson15.part2;

public class Employee {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Age=" + age;
    }
}
