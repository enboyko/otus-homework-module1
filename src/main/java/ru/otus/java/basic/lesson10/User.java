package ru.otus.java.basic.lesson10;

public class User {
    private String surname;
    private String firstName;
    private String middleName;
    private int yearOfBirth;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String surname, String firstName, String middleName, int yearOfBirth, String email) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + surname + " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
        System.out.println();
    }
}
