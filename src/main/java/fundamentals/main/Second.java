package fundamentals.main;

// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class Second {
    public static void main(String[] args) {
        System.out.print("Args vice versa: ");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
