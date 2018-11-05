package com.question;

import java.security.cert.PolicyQualifierInfo;
import java.util.ArrayList;
import java.util.Random;

public class QuestionManager {

    private ArrayList<Question> questionsList = new ArrayList<>();

    public QuestionManager(ArrayList<String> lines){
        linesToQuestions(lines);
    }

    public void add(Question question){
        questionsList.add(question);
    }

    public Question getByIndex(int index){
        return questionsList.get(index);
    }

    public ArrayList<Question> getAll(){
        return questionsList;
    }

    public int getSize(){
        return questionsList.size();
    }

    public void setByIndex(int index, Question question){
        questionsList.set(index, question);
    }

    public void linesToQuestions(ArrayList<String> lines){

        for(String string : lines){
            String[] line = string.split("\\[|\\]");
            try {
                Question question = new Question(string, line[1]);
                questionsList.add(question);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e + ": 空白行を消して再度お試しください。");
            }
        }
    }

    public void shuffle(){
        ArrayList<Question> newList = new ArrayList<>(questionsList.size());

        System.out.println(newList.size());

//        Random random = new Random();
//
//        String[] type;
//
//        for (Question q: questionsList) {
//            newList.set(random.nextInt()*questionsList.size(), q);
//        }
//
//        questionsList = newList;
    }


}
