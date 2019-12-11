package Fundamentals.OptionalTaskOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fourth {
    //4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
    public static void main(String[] args) {
        System.out.println("Array args: ");
        for (String str : args) {
            System.out.print(str + "  ");
        }
        Map<String, String> dictionary = new LinkedHashMap<>();
        for (String str : args) {
            char[] charArray = str.toCharArray();
            HashMap<String, String> newDictionary = new LinkedHashMap<>();
            int amountKeysIntoNewDictionary = 0;
            for (int i = 0; i < charArray.length; i++) {
                newDictionary.put(Character.toString(charArray[i]), "-");
            }
            amountKeysIntoNewDictionary = newDictionary.size();
            dictionary.put(str, Integer.toString(amountKeysIntoNewDictionary));
        }
        ArrayList<String> keys = new ArrayList<>(dictionary.keySet());
        if(dictionary.isEmpty()){
            System.out.println("Array is empty");
        } else {
            String key =keys.get(0);
            int minIntoNewDictionary = Integer.parseInt(dictionary.get(key));
            for(int i = 1; i < keys.size(); i++){
                if(minIntoNewDictionary > Integer.parseInt(dictionary.get(keys.get(i)))){
                    minIntoNewDictionary  = Integer.parseInt(dictionary.get(keys.get(i)));
                    key = keys.get(i);
                }
            }
            System.out.println("\nFirst digit witch contains less different numbers than others in array is " + key);
        }
    }
}
