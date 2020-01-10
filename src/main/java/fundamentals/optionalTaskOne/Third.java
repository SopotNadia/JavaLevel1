package fundamentals.optionalTaskOne;

import java.util.Scanner;

public class Third {
    //3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
    public static void main(String[] args) {
        System.out.print("Array args: ");
        int Sum = 0;
        double average;
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "  ");
            Sum = Sum + args[i].length();
        }
        if (args.length > 0) {
            average = Sum / args.length;
        } else {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("\nВывести те числа, длина которых больше средней длины по всем числам? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Средняя длина по всем числам:  " + average);
        switch (answer) {
            case "Y":
                for (int i = 0; i < args.length; i++) {
                    if (args[i].length() >= average) {
                        System.out.println("Число:  " + args[i] + "  длина числа: " + args[i].length());
                    }
                }
                break;
            case "N":
                for (int i = 0; i < args.length; i++) {
                    if (args[i].length() < average) {
                        System.out.println("Число:  " + args[i] + "  длина числа: " + args[i].length());
                    }
                }
                break;
            default:
                System.out.println("Ваш вариант ответа неправильный");
        }
    }
}
