package Fundamentals.Main;

import java.util.Scanner;
//1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class First {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}

