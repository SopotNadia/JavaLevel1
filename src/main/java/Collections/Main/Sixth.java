package Collections.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        //Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
        File file = new File("sixthOptionalTask");
        Scanner scanner;
        ArrayList<String> listLinesFromFile = new ArrayList<>();
        {
            try {
                scanner = new Scanner(file);
                while(scanner.hasNextLine()){
                    listLinesFromFile.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("There isn't this file or a title was written incorrectly");
                return;
            }
        }
        Collections.sort(listLinesFromFile);
        System.out.println(listLinesFromFile);
    }
}
