package ru.otus.java.basic.lesson14;

import ru.otus.java.basic.lesson14.createdexceptions.AppArrayDataException;
import ru.otus.java.basic.lesson14.createdexceptions.AppArraySizeException;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr = {{"0", "0", "5", "прапр"},
                {"6", "0", "0", "0"},
                {"0", "4", "0", "10"},
                {"10", "0", "0", "0"}};
        printArray(arr);
        try {
            castAndSumElements(arr);
        } catch (AppArraySizeException e) {
            System.out.println("Failed to sum array elements: dimension/s does/do not equal 4!");
            System.out.println("error: " + e.toString());
            e.printStackTrace();
        }
    }

    private static void castAndSumElements(String[][] arr) throws AppArraySizeException {
        int sum = 0;
        int interimSum;
        for (int k = 0; k < 4; k++) {
            if (arr.length != 4 || arr[k].length != 4) {
                throw new AppArraySizeException();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                    interimSum = sum;
                    System.out.println("Interim sum equals: " + interimSum);
                } catch (NumberFormatException ex) {
                    throw new AppArrayDataException("custom AppArrayDataException", ex);
                }
            }
        }
        System.out.println("================================");
        System.out.println("Success! Array elements' sum equals " + sum);
    }

    private static void printArray(String[][] arr) {
        System.out.println("Array is :::::::::::::\n");
        for (String[] row : arr) {
            for (String element : row) {
                System.out.print(element + "   ");
            }
            System.out.println();
        }
//        // или вывод таким способом:
//        System.out.println(Arrays.toString(arr));
    }
}
