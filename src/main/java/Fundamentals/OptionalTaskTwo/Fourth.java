package Fundamentals.OptionalTaskTwo;

import java.util.HashSet;
import java.util.Scanner;

public class Fourth {
    //4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
    public static void main(String[] args) {
        int sizeArray = getSizeArray();
        int[][] array = setArrayElementsValues(sizeArray);
        System.out.println("Array: ");
        printArray(array);
        int maxValue = getMaxValueInArray(array);
        System.out.println("Array without rows and columns with maximum element ");
        printArray(deleteRowsAndColumnsWithMaximum(array, maxValue));                                                      // new print

    }

    private static int getSizeArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size array(integer type): ");
        int sizeArray;
        if (!input.hasNextInt()) {
            System.out.println("Array size has to be integer.");
            return getSizeArray();
        } else {
            sizeArray = input.nextInt();
        }
        if (sizeArray < 1){
            System.out.println("Array size has to be positive integer.");
            return getSizeArray();
        }
        return  sizeArray;
    }

    private static int[][] setArrayElementsValues(int sizeArray){
        int[][] array = new int[sizeArray][sizeArray];
        System.out.println("Enter maximum value of array element (integer) ");
        Scanner input = new Scanner(System.in);
        if(! input.hasNextInt()){
            System.out.println("Maximum value of array element has to be integer");
            return setArrayElementsValues(sizeArray);
        } else {
            int randomValue = input.nextInt();
            for (int i = 0; i < sizeArray; i++) {
                for (int j = 0; j < sizeArray; j++) {
                    array[i][j] = (int) (Math.random() * (2 * randomValue + 1) - randomValue);
                }
            }
        }
        return array;
    }

    private static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getMaxValueInArray(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    private static int[][] deleteRowsAndColumnsWithMaximum(int[][] array, int maxValue){
        HashSet<Integer> arrayListLines = new HashSet<>();
        HashSet<Integer> arrayListColumns = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (maxValue == array[i][j]) {
                    arrayListLines.add(i);
                    arrayListColumns.add(j);
                }
            }
        }
        int sizeOfArrayLine = arrayListLines.size();
        int sizeOfArrayColumn = arrayListColumns.size();

        int newSizeLine = array.length - sizeOfArrayLine;
        int newSizeColumn = array.length - sizeOfArrayColumn;
        int[][] newArray = new int[newSizeLine][newSizeColumn];
        int k = 0;
        int m;
        for (int i = 0; i < array.length; i++) {
            if (!arrayListLines.contains(i)) {
                m = 0;
                for (int j = 0; j < array.length; j++) {
                    if (!arrayListColumns.contains(j)) {
                        newArray[k][m] = array[i][j];
                        m++;
                    }
                }
                k++;
            }
        }
        return newArray;
    }
}
