package fundamentals.optionalTaskTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
    //1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    public static void main(String[] args) {
        int[][] array = setArrayElementsValues();
        printArray(array);
        int[][] sortedArray = sortArray(array);
        printArray(sortedArray);
    }

    private static int[][] setArrayElementsValues() {
        int sizeArray = getSizeArray();
        int randomValue = getMaxValueForArrayElements();
        int[][] array = new int[sizeArray][sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                array[i][j] = (int) (Math.random() * (2 * randomValue + 1) - randomValue);
            }
        }
        return array;
    }

    private static int getSizeArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size array(integer type): ");
        int sizeArray;
        if (!input.hasNextInt()) {
            System.out.println("Array size has to be integer.");
            return getSizeArray();
        } else {
            sizeArray = input.nextInt();
        }
        if (sizeArray < 1) {
            System.out.println("Array size has to be positive integer.");
            return getSizeArray();
        }
        return sizeArray;
    }

    private static int getMaxValueForArrayElements() {
        System.out.println("Enter maximum value of array element (integer) ");
        int randomValue = 0;
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) {
            System.out.println("Maximum value has to be integer");
            return getMaxValueForArrayElements();
        } else randomValue = input.nextInt();
        return randomValue;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] sortArray(int[][] array) {
        System.out.println("Do you want to sort by Column or Row? (C/R)");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine().toUpperCase();
        try {
            if (answer.equals("C")) {
                System.out.println("Enter column number ");
                int column = input.nextInt();

                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i][column] >= array[j][column]) {
                            for (int y = 0; y < array.length; y++) {
                                int tmp = array[i][y];
                                array[i][y] = array[j][y];
                                array[j][y] = tmp;
                            }
                        }
                    }
                }
            } else if (answer.equals("R")) {
                System.out.println("Enter row number ");
                int row = input.nextInt();

                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[row][i] >= array[row][j]) {
                            for (int y = 0; y < array.length; y++) {
                                int tmpNew = array[y][i];
                                array[y][i] = array[y][j];
                                array[y][j] = tmpNew;
                            }
                        }
                    }
                }
            } else {
                System.out.println("You didn't select method of sort");
                return sortArray(array);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds ");
            return sortArray(array);
        } catch (InputMismatchException e) {
            System.out.println("You have to enter integer ");
            return sortArray(array);
        }
        return array;
    }
}
