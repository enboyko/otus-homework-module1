package ru.otus.java.basic.lesson15.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("============================================================================");
        System.out.println("Task 1 :");
        int firstNumber = 3;
        int secondNumber = 7;
        System.out.println("First (minimum) number: " + firstNumber);
        System.out.println("Second (maximum) number: " + secondNumber);
        System.out.println("ArrayList with sequential numbers between first (minimum) "
                + "number and second (maximum) number:");
        System.out.println(makeSequentialArrList(firstNumber, secondNumber));
        System.out.println("============================================================================");
        System.out.println("Task 2 :");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 100, 0, 500));
        System.out.println("Initial list: " + integerList);
        System.out.print("Sum of elements greater than 5:");
        System.out.println(sumGreaterFiveListElements(integerList));
        System.out.println("============================================================================");
        System.out.println("Task 3 :");
        int numberToOverwrite = 6;
        List<Integer> listToBeOverwritten = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listToBeOverwritten.add((int) (Math.random() * 10));
        }
        System.out.println("List to be overwritten with a number [" + numberToOverwrite + "] :");
        System.out.println(listToBeOverwritten);
        System.out.println("List, overwritten with the number [" + numberToOverwrite + "] :");
        System.out.println(overwriteList(numberToOverwrite, listToBeOverwritten));
        System.out.println("============================================================================");
        System.out.println("Task 4 :");
        int numberToIncrease = 1;
        List<Integer> listToBeIncreased = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("List to be increased with a number [" + numberToIncrease + "] :");
        System.out.println(listToBeIncreased);
        System.out.println("List, increased with the number [" + numberToIncrease + "] :");
        System.out.println(increaseListElements(numberToIncrease, listToBeIncreased));
        System.out.println("============================================================================");

    }

    private static ArrayList<Integer> makeSequentialArrList(int min, int max) {
        ArrayList<Integer> list = new ArrayList();
        int numberOfElements = max - min;
        for (int i = 0; i <= numberOfElements; i++) {
            list.add(min + i);
        }
        return list;
    }

    private static int sumGreaterFiveListElements(List<Integer> list) {
        int sum = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    private static List<Integer> overwriteList(int number, List<Integer> list) {
        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            list.set(i, number);
            i++;
        }
        return list;
    }

    private static List<Integer> increaseListElements(int number, List<Integer> list) {
        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            int element = (int) iterator.next();
            list.set(i, element + number);
            i++;
        }
        return list;
    }
}
