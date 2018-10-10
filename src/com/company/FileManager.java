package com.company;

import com.question.Question;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static File readFile(){
//        Scanner reader = new Scanner(System.in);
//        System.out.println("取り込むファイル名を入力してください。");
//        String infile = reader.nextLine();
//        reader.close();
//
//        return new File("file_input\\" + infile);

        return new File("file_input\\" + "original.txt");
    }

    public static ArrayList<String> fileToArray(File file){
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


}
