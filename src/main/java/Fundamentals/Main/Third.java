package Fundamentals.Main;

import java.util.Scanner;

// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

public class Third {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int amountOfDigits = scanner.nextInt();
        for (int i = 0; i < amountOfDigits; i++){
            System.out.println((int) (Math.random()*100 )+ 1);
        }
        for (int i = 0; i < amountOfDigits; i++){
            System.out.print((int)((Math.random()*100 )+ 1) + " ");
        }
    }
}
