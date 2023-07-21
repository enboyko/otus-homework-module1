package ru.otus.java.basic.lesson7;


public class MainApp {
    public static void main(String[] args) {
        int[][] arrWithZeros = {{0, 0, 5, 0}, {6, 0, 0, 0}, {0, 4, 0, 10}};
        System.out.println("\nFirst task (sumOfPositiveElements):");
        System.out.println("Positive elements sum equals: " + sumOfPositiveElements(arrWithZeros));
        System.out.println("==================================================");

        int size = 4;
        System.out.println("Second task (printSquare):");
        System.out.println("Here's the square:");
        printSquare(size);
        System.out.println("==================================================");

        int[][] arrToZeroDiagElements = {{1, 6, 8, 3, 4}, {6, 9, 7, 2, 1}, {5, 4, 7, 2, 3}, {6, 9, 7, 2, 5}, {3, 6, 7, 3, 9}};
        System.out.println("Third task (zeroDiagonalElements):");
        System.out.println("Here's the array with zeroed diagonals:");
        zeroDiagonalElements(arrToZeroDiagElements);
        System.out.println("==================================================");

        int[][] arrToSearchForMaxEl = {{1, 6, 50, 3, 4}, {6, 9, 100, 2, 1}};
        System.out.println("Fourth task (findMax):");
        System.out.println("Maximum element equals: " + findMax(arrToSearchForMaxEl));
        System.out.println("==================================================");

        int[][] arrToSum = {{1, 6, 8, 3, 4}, {6, 4, 9, 1, 10}, {5, 4, 7, 2, 3}, {6, 9, 7, 2, 5}, {3, 6, 7, 3, 9}};
        System.out.println("Fourth task (sumSecondLineElements):");
        System.out.println("Second line elements sum equals: " + sumSecondLineElements(arrToSum));
        System.out.println("==================================================");
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int arrSize) {
        char[][] squareArr = new char[arrSize][arrSize];
        for (char[] row : squareArr) {
            for (char element : row) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void zeroDiagonalElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || j == arr.length - i - 1) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int maxElement = array[0][0];
        for (int[] row : array) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }

    public static int sumSecondLineElements(int[][] arr) {
        int result = 0;
        if (arr.length < 2) {
            result = -1;
            return result;
        }
        for (int j = 0; j < arr[1].length; j++) {
            result += arr[1][j];
        }
        return result;
    }
}
