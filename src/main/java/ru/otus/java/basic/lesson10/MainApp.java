package ru.otus.java.basic.lesson10;

public class MainApp {
    public static void main(String[] args) {
        User[] user = {
                new User("Иванов", "Иван", "Иванович", 1950, "1111@ya.ru"),
                new User("Петров", "Петр", "Петрович", 1960, "2222@ya.ru"),
                new User("Сидоров", "Сидр", "Сидорович", 1980, "3333@ya.ru"),
                new User("Николаев", "Николай", "Николаевич", 1990, "4444@ya.ru"),
                new User("Ильин", "Илья", "Ильич", 2000, "5555@ya.ru")};
        for (int i = 0; i < user.length; i++) {
            if ((2023 - user[i].getYearOfBirth()) > 40) {
                user[i].info();
            }
        }

        System.out.println("===============================================");
        System.out.println("Second task ::\n");
        Box boxBlack = new Box(1, 2, 3, "black");
        System.out.println("The colour of the box was " + boxBlack.getColour());
        boxBlack.setColour("green");
        System.out.println("===============");
        System.out.println("Try to put an object in the box:");
        boxBlack.putIn();
        System.out.println("===============");
        System.out.println("Open the box:");
        boxBlack.setOpen(true);
        System.out.println("===============");
        System.out.println("Try to put an object in the box again:");
        boxBlack.putIn();
        System.out.println("===============");
        System.out.println("Try to get an object out of the box:");
        boxBlack.getOut();
        System.out.println("===============");
        System.out.println("Try to get an object out of the box again:");
        boxBlack.getOut();
        System.out.println("===============");
        System.out.println("Close the box:");
        boxBlack.setOpen(false);
    }
}
