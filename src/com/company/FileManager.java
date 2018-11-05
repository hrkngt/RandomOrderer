package com.company;

import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private File file;

    public FileManager(String fileName){
        this.file = new File("file_input\\" + fileName);
    }

    public File getFile(){
        return file;
    }

    public ArrayList<String> FileToStringArray(){
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
