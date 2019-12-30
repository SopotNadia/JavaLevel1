package IOFundamentals;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NinthOptional {
    //Из текста Java-программы удалить все виды комментариев
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path where you want to delete all comments");
        String filePath = scanner.nextLine();
        ArrayList<String> linesFromFile = new ArrayList<>();
        try(FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                linesFromFile.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(filePath + " doesn't exist");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder linesFromFileForDeletingComments = new StringBuilder();
        for(String line: linesFromFile){
            linesFromFileForDeletingComments.append(line);
            linesFromFileForDeletingComments.append("\n");
        }
        StringBuilder linesAfterDeletingComments = deleteComments(linesFromFileForDeletingComments);
        try (FileWriter writer = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write(linesAfterDeletingComments.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static StringBuilder deleteComments(StringBuilder string){
        Pattern pattern = Pattern.compile("\\/\\/.*");
        Matcher matcher = pattern.matcher(string);
        while(matcher.find()){
            string = new StringBuilder(matcher.replaceAll(""));
        }
        Pattern otherPattern = Pattern.compile("[/]\\*.*(?:.|[\\n\\r])*?\\*[/]");
        Matcher otherMatcher = otherPattern.matcher(string);
        while(otherMatcher.find()){
            string = new StringBuilder(otherMatcher.replaceAll(""));
        }
        return string;
    }
}
