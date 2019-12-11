package Fundamentals.OptionalTaskOne;

public class Fifth {
    // 5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом
    // четных и нечетных цифр.
    public static void main(String[] args){
        int amountOfEvenDigits = 0;
        int amountOfOddEvenDigits = 0;
        int odd = 0;
        int even = 0;
        System.out.print("Array args ");
        for(String str: args){
            System.out.print(str + " ");
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++){
                if(charArray[i]=='0' || charArray[i]=='2' || charArray[i]=='4' || charArray[i]=='6' || charArray[i]=='8' ){
                    even++;
                } else odd++;
                if(even == charArray.length) {
                    amountOfEvenDigits++;
                }
            }
            if (even == odd) amountOfOddEvenDigits++;
            even = 0;
            odd = 0;

        }
        System.out.println("\nAmount numbers with only even digits = " + amountOfEvenDigits);
        System.out.println("Amount numbers with the same amount even and odd digits = " + amountOfOddEvenDigits);
    }
}
