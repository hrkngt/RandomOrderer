package com.company;

import com.question.Question;
import com.question.QuestionManager;

import java.io.*;
import java.util.*;

public class Main {
    FileManager fileManager;
    QuestionManager questionManager;

    private void run(){

        ArrayList<String> lines = new FileManager("original.txt").fileToArray();
        questionManager = new QuestionManager(lines);
        questionManager.shuffle();
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
