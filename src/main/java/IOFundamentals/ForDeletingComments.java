package IOFundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ForDeletingComments {
    public static void main(String[] args) {
        
        int[] arrayWithNumbers = new int[10];
        try (FileWriter writer = new FileWriter("data/firstTask.txt", false)) {
            for (int i = 0; i < 10; i++) {
                arrayWithNumbers[i] = (int) (Math.random() * 100);  
                writer.write(Integer.toString(arrayWithNumbers[i]));
                writer.write(" ");
            }
        } catch (IOException e) {  
            e.printStackTrace();
        }
            
        File file = new File("data/firstTask.txt"); 
        String[] arrayFromFileWithNumbers = new String[10];
        try (Scanner scanner = new Scanner(file)){
            arrayFromFileWithNumbers = scanner.nextLine().split(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[] arrayForSort = new int[10];    
        for(int i = 0; i < 10; i++){
            arrayForSort[i] = Integer.parseInt(arrayFromFileWithNumbers[i]);
        }
        Arrays.sort(arrayForSort);           
        try (FileWriter writer = new FileWriter("data/firstTask.txt", false);){
            writer.write(Arrays.toString(arrayForSort));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

