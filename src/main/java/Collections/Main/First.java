package Collections.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First {
    static public void main(String[] args){
        //Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
        List<String> listOfLines = new ArrayList<>();
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            File file = new File("firstOptionalTask");
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                listOfLines.add(scanner.nextLine());
            }
            printWriter = new PrintWriter("firstOptionalTask");
            for(int i = listOfLines.size() - 1; i > -1; i--){
                printWriter.println(listOfLines.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File 'firstOptionalTask' doesn't exist.");
        }
        finally {
            if(scanner != null){
                scanner.close();
            }
            if (printWriter != null){
                printWriter.close();
            }
        }
    }
}
