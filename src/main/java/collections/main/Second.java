package collections.main;

import java.util.Scanner;
import java.util.Stack;

public class Second {
    public static void main(String[] args) {
        //Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
        System.out.print("Enter any integer ");
        Scanner scanner = new Scanner(System.in);
        Integer enteredNumber = null;
        if (scanner.hasNextInt()) {
            enteredNumber = scanner.nextInt();
        } else {
            System.out.println("You didn't enter whole number");
            return;
        }
        char[] arrayOfElements = enteredNumber.toString().toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char element : arrayOfElements) {
            stack.push(element);
        }
        StringBuilder changedNumber = new StringBuilder();
        while (!stack.empty()) {
            changedNumber.append(stack.pop());
        }
        System.out.println((Integer.parseInt(changedNumber.toString())));
    }
}
