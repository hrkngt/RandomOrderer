package com.company;

import com.question.Question;
import com.question.QuestionManager;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager("original.txt");

        ArrayList<String> lines = fileManager.FileToStringArray();

        QuestionManager questions = new QuestionManager(lines);

//        for (Question q: questions.getAll()) {
//            System.out.println(q.getText() + " : " + q.getType());
//        }

        questions.shuffle();
    }

    public static ArrayList<String> Randomize(ArrayList<String> text){
        for (String string: text) {

        }
        return null;
    }


}
