package ru.otus.java.basic.lesson3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int[] methodNumArray = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number of method (integer from 1 to 5):");

        if (scanner.hasNextInt()) {
            int methodNumber = scanner.nextInt();

            for (int i = 0; i < methodNumArray.length; i++) {
                if (methodNumber < methodNumArray[0] || methodNumber > methodNumArray[4]) {
                    System.out.println("You've input wrong number. Please input number of method (integer from 1 to 5) next time.");
                    break;
                } else if (methodNumArray[i] == methodNumber) {
                    System.out.println("You've input number " + methodNumber + ". " + "Let's call our corresponding method:");
                    if (methodNumber == 1) {
                        greetings();
                    } else if (methodNumber == 2) {
                        int a = (int) (Math.random() * 10);
                        int b = (int) (Math.random() * -7);
                        int c = (int) (Math.random() * 4);

                        checkSign(a, b, c);
                    } else if (methodNumber == 3) {
                        selectColor();
                    } else if (methodNumber == 4) {
                        compareNumbers();
                    } else {
                        int initValue = (int) (Math.random() * 10);
                        int delta = (int) (Math.random() * 10);
                        boolean increment = (int) (Math.random() * 8) < 4;

                        addOrSubtractAndPrint(initValue, delta, increment);
                    }
                    break;
                }
            }
        } else {
            System.out.println("You've input not an integer number from the interval (1::5)");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int firstVal, int secondVal, int thirdVal) {
        int sum;

        System.out.println("Number a equals: " + firstVal);
        System.out.println("Number b equals: " + secondVal);
        System.out.println("Number c equals: " + thirdVal);

        sum = firstVal + secondVal + thirdVal;

        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 30);

        System.out.println("data equals: " + data);

        if (data <= 10) {
            System.out.println("Red");
        } else if (data > 10 && data <= 20) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);

        System.out.println("a equals: " + a);
        System.out.println("b equals: " + b);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int val, int delt, boolean incr) {
        System.out.println("initValue equals: " + val);
        System.out.println("delta equals: " + delt);
        System.out.println("increment is: " + incr);

        int result;

        if (incr) {
            result = val + delt;
            System.out.println("Sum equals: " + result);
        } else {
            result = val - delt;
            System.out.println("Difference equals: " + result);
        }
    }
}
