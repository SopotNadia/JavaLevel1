package IOFundamentals;

import java.io.*;

public class ThirdOptional {
    //Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/IOFundamentals/ForReadingSecondTask.java");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/thirdTask.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                StringBuilder lineFromFile = new StringBuilder(line);
                lineFromFile.reverse();
                bufferedWriter.write(lineFromFile.toString(), 0, lineFromFile.length());
                bufferedWriter.write("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
