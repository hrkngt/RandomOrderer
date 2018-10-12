package com.company;

import com.question.Question;
import com.question.QuestionManager;

import java.io.*;
import java.util.*;

public class Main {


    private void run(){
        QuestionManager questionManager;

        ArrayList<String> lines = new FileManager("original.txt").fileToArray();
        questionManager = new QuestionManager(lines);
        questionManager.shuffle();

        for(Question q : questionManager.getAll()){
            System.out.println(q.getText() + "     " + q.getAnswer() );
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
