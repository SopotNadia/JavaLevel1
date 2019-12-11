package Fundamentals.OptionalTaskOne;

public class First {
    //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args){
        String minString = null;
        String maxString = null;
        int minLengthString = Integer.MAX_VALUE;
        int maxLengthString = 1;
        if(args.length == 0){
            System.out.println("There isn't any digit in array called args");
            return;
        }
        for(int i = 0; i < args.length; i++) {
            if (minLengthString >= args[i].length()) {
                minLengthString = args[i].length();
                minString = args[i];
            }
            if (maxLengthString <= args[i].length()) {
                maxLengthString = args[i].length();
                maxString = args[i];
            }
        }
        System.out.println("It's the shortest number: " + minString + ". Its length is " + minLengthString);
        System.out.println("It's the longest number: " + maxString + ". Its length is " + maxLengthString);
    }

}
