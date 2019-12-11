package Fundamentals.OptionalTaskOne;

import java.util.Arrays;
import java.util.Scanner;

public class Second {
    //Вывести числа в порядке возрастания (убывания) значений их длины.
    public static void main(String[] args){
        System.out.print("Array: ");
        for(int k = 0; k < args.length; k++) {
            System.out.print(args[k] + " ");
        }
        System.out.println();
        for(int i = 0; i < args.length; i++) {
            int minLength = args[i].length();
            int minIndex = i;
            for (int j = i + 1; j < args.length; j++) {
                if (minLength <= args[j].length()) {
                    minLength = args[j].length();
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                String newMinLength = args[i];
                args[i] = args[minIndex];
                args[minIndex] = newMinLength;
            }
        }
        System.out.println("Do you want to sort array ascending? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer){
            case "Y":
                System.out.print("Ascending ");
                for (int k = args.length -1; k >= 0; k--) {
                    System.out.print(args[k] + " ");}
                break;
            case "N":
                System.out.print("Descending ");
                System.out.println(Arrays.toString(args));
                break;
            default: System.out.println("Your answer is wrong ");
        }

    }
}
