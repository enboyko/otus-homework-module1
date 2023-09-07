package ru.otus.java.basic.lesson16;

public class MainApp {

    public static void main(String[] args) {
        PhoneBook.add("Ivanov Ivan Ivanovich", 345678);
        PhoneBook.add("Ivanov Ivan Ivanovich", 845679);
        PhoneBook.add("Ivanov Ivan Ivanovich", 6496679);
        PhoneBook.add("Ivanov Sergey Petrovich", 643865);
        PhoneBook.add("Petrov Sergey Petrovich", 643865);
        System.out.println("===========================================================================");
        PhoneBook.find("Ivanov Ivan Ivanovich");
        System.out.println("===========================================================================");
        System.out.println("Does phone book contain phone number " + 6496679 + "? "
                + PhoneBook.containsPhoneNumber(6496679));
    }
}
