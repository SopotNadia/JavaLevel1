package Collections.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Eighth {
    //Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв,
    // считать одинаковыми. Использовать класс HashSet.
    public static void main(String[] args){
        File file = new File("eighthOptionalTask");
        ArrayList<String[]> listOfWords = new ArrayList<>();
        Scanner scanner;
        {
            try{
                scanner = new Scanner(file);
                while (scanner.hasNextLine()){
                    listOfWords.add(scanner.nextLine().toLowerCase().replaceAll("\\?","")
                            .replaceAll("\\.", "")
                            .replaceAll(",", "")
                            .replaceAll("«", "")
                            .replaceAll("»", "")
                            .replaceAll("—", "")
                            .split(" "));
                }
            } catch (FileNotFoundException e) {
                System.out.println("There isn't this file or a title was written incorrectly\"");
                return;
            }
        }
        HashSet<String> setOfWords = new HashSet<>();
        for(String[] array: listOfWords){
            for(String word: array){
                setOfWords.add(word);
            }
        }
        System.out.println(setOfWords);
    }
}
