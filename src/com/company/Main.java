package com.company;

import com.question.Pronounciation;
import com.question.Question;

import java.io.*;
import java.util.*;

public class Main {

//    File file;
//    FileManager fileManager;
//    QuestionConverter questionConverter;

    public void run(){
        File file = FileManager.readFile();
        ArrayList<String> lines = FileManager.fileToArray(file);
        ArrayList<Pronounciation> questions = QuestionConverter.textToPronounciation(lines);

        questions = QuestionConverter.randomizePron(questions);

        for (Pronounciation q: questions) {
            System.out.println(q.getText() + " / " + q.getType());
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public static ArrayList<String> Randomize(ArrayList<String> text){
        for (String string: text) {

        }
        return null;
    }

}
