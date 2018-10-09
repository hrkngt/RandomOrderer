package com.company;

import com.question.Question;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File file = ReadFile();
        ArrayList<String> lines = FileToArray(file);
        ArrayList<Question> questions = new ArrayList<Question>();
        questions = LinesToQuestions(lines);
        for (Question q: questions) {
            System.out.println(q.getText() + " : " + q.getType());
        }
    }

    public static File ReadFile(){
//        Scanner reader = new Scanner(System.in);
//        System.out.println("取り込むファイル名を入力してください。");
//        String infile = reader.nextLine();
//        reader.close();
//
//        return new File("file_input\\" + infile);

        return new File("file_input\\" + "original.txt");


    }
    public static ArrayList<String> FileToArray(File file){
        ArrayList<String> lines = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();

            while (str != null) {
                lines.add(str);
                str = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }
        return lines;
    }


    public static ArrayList<String> Randomize(ArrayList<String> text){
        for (String string: text) {

        }
        return null;
    }

    public static ArrayList<Question> LinesToQuestions(ArrayList<String> lines){

        ArrayList<Question> questions = new ArrayList<Question>();

        for(String string : lines){
            String[] line = string.split("\\[|\\]");
            try {
                Question question = new Question(string, line[1]);
                questions.add(question);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e + ": 空白行を消して再度お試しください。");
            }
        }
        return questions;
    }

}
