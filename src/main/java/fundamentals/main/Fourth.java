package fundamentals.main;

//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class Fourth {
    public static void main(String[] args) {
        int sum = 0, product = 1;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
            product = product * Integer.parseInt(args[i]);
        }
        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of numbers = " + product);
    }
}
