package ru.otus.java.basic.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 2};
        int[] array3 = {1, 1, 1, 1, 1};
        System.out.println("First task (getResArray) result:");
        System.out.println(Arrays.toString(getResArray(array1, array2, array3)));
        System.out.println("==================================================");

        int[] maybePointArr = {1, 1, 1, 1, 1, 5};
        System.out.println("Second task (checkPoint) result:");
        System.out.println(checkPoint(maybePointArr));
        System.out.println("==================================================");

        int[] someArr = {80, 50, 10, 8, 7, 6};
        System.out.println("Third task (knowAscOrDesc):");
        System.out.println(knowAscOrDesc(someArr));
        System.out.println("==================================================");

        int[] arrToTurnOver = {8, 1, 4, 7, 2, 51, 66};
        System.out.println("Fourth task (turnOver) result:");
        System.out.println(Arrays.toString(turnOver(arrToTurnOver)));
        System.out.println("==================================================");
    }

    public static int[] getResArray(int[] arr1, int[] arr2, int[] arr3) {
        int maxLength = arr1.length;
        maxLength = Math.max(maxLength, arr2.length);
        maxLength = Math.max(maxLength, arr3.length);
        int[] resultArr = new int[maxLength];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resultArr[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            resultArr[i] += arr3[i];
        }
        return resultArr;
    }

    public static boolean checkPoint(int[] arrToCheck) {
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < arrToCheck.length; i++) {
            sum += arrToCheck[i];
        }
        for (int i = 0; i < arrToCheck.length; i++) {
            leftSum += arrToCheck[i];
            if (leftSum * 2 == sum) {
                return true;
            }
        }
        return false;
    }

    public static boolean knowAscOrDesc(int[] ascOrDescArr) {
        boolean order = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input order: 1 for Ascending or 2 for Descending");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < ascOrDescArr.length - 1; i++) {
                if (ascOrDescArr[i] < ascOrDescArr[i + 1]) {
                    order = true;
                } else {
                    order = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < ascOrDescArr.length - 1; i++) {
                if (ascOrDescArr[i] > ascOrDescArr[i + 1]) {
                    order = true;
                } else {
                    order = false;
                    break;
                }
            }
        }
        return order;
    }

    public static int[] turnOver(int[] enterArr) {
        for (int i = 0; i < enterArr.length / 2; i++) {
            int temp = enterArr[i];
            enterArr[i] = enterArr[enterArr.length - 1 - i];
            enterArr[enterArr.length - 1 - i] = temp;
        }
        return enterArr;
    }
}
