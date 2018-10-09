package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("取り込むファイル名を入力してください。");
//        String infile = reader.nextLine();
//        reader.close();

        ArrayList<String> text;

        text = ReadFile();

//        text = Randomize(text);


    }

    public static ArrayList<String> ReadFile(){
        //read file in
        try {
            File file = new File("file_input\\original.txt");
//            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();

            ArrayList<String> lines = new ArrayList<String>();

            while (str != null){
                lines.add(str);
                str = bufferedReader.readLine();
            }

            System.out.println(lines);

        }catch (FileNotFoundException e){
            System.out.println("ファイルが存在しません。");
            return null;
        }catch (IOException e){
            System.out.println(e.toString());
        }
        return null;
    }

    public static List<String> Randomize(List<String> text){
        System.out.println(text.size());
        return null;
    }


}
