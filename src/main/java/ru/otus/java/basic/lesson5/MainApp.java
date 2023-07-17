package ru.otus.java.basic.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 2};
        int[] array3 = {1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(getResArray(array1, array2, array3)));

        int[] maybePointArr = {1, 1, 1, 1, 1, 5};
        System.out.println(checkPoint(maybePointArr));

        int[] someArr = {1, 1, 1, 1, 1, 5};
        System.out.println(knowAscOrDesc(someArr));

        int[] arrToTurnOver = {8, 1, 4, 7, 2, 5};
        System.out.println(Arrays.toString(turnOver(arrToTurnOver)));
    }

    public static int[] getResArray(int[] initFirstArr, int[] initSecArr, int[] initThirdArr) {
        int[] newFirstArr;
        int[] newSecondArr;
        int[] finalFirst;
        int[] finalSecondArr;
        int[] finalThirdArr;
        int[] intermediateSumArr;
        int[] ResSumArr;

        // Можно было бы сделать проще - двумерный массив из исходных массивов
        if (initFirstArr.length < initSecArr.length) {
            newFirstArr = initFirstArr;
            newSecondArr = initSecArr;
        } else {
            newFirstArr = initSecArr;
            newSecondArr = initFirstArr;
        }

        if (initThirdArr.length < newFirstArr.length) {
            finalFirst = initThirdArr;
            finalSecondArr = newSecondArr;
            finalThirdArr = initThirdArr;
        } else if (initThirdArr.length < newSecondArr.length) {
            finalFirst = newFirstArr;
            finalSecondArr = initThirdArr;
            finalThirdArr = newSecondArr;
        } else {
            finalFirst = newFirstArr;
            finalSecondArr = newSecondArr;
            finalThirdArr = initThirdArr;
        }

        intermediateSumArr = finalSecondArr;
        for (int i = 0; i < finalFirst.length; i++) {
            intermediateSumArr[i] = intermediateSumArr[i] + finalFirst[i];
        }

        ResSumArr = finalThirdArr;
        for (int i = 0; i < intermediateSumArr.length; i++) {
            ResSumArr[i] = ResSumArr[i] + intermediateSumArr[i];
        }
        return ResSumArr;
    }

    public static boolean checkPoint(int[] arrToCheck) {
        int sum = 0;
        int leftSum = 0;
        boolean check = false;
        for (int i = 0; i < arrToCheck.length; i++) {
            sum += arrToCheck[i];
        }
        for (int i = 0; i < arrToCheck.length; i++) {
            leftSum += arrToCheck[i];
            sum -= arrToCheck[i];
            if (leftSum == sum) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static String knowAscOrDesc(int[] ascOrDescArr) {
        String order = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input order: 1 for Ascending or 2 for Descending");
        int choice = scanner.nextInt();

        // По сути, здесь не нужно условие (лишь цикл for), т.к. вне зависимости от выбора пользователя мы выведем ему порядок массива
        if (choice == 1) {
            for (int i = 0; i < ascOrDescArr.length - 1; i++) {
                if (ascOrDescArr[i] < ascOrDescArr[i + 1]) {
                    order = "Ascending";
                } else {
                    order = "Descending";
                }
            }
        } else {
            for (int i = 0; i < ascOrDescArr.length - 1; i++) {
                if (ascOrDescArr[i] > ascOrDescArr[i + 1]) {
                    order = "Descending";
                } else {
                    order = "Ascending";
                }
            }
        }
        return order;
    }

    public static int[] turnOver(int[] enterArr) {
        int[] overturnedArr = new int[enterArr.length];
        for (int i = 0; i < enterArr.length; i++) {
            overturnedArr[enterArr.length - 1 - i] = enterArr[i];
        }
        return overturnedArr;
    }
}
