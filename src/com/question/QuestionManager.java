package com.question;

import java.util.*;

public class QuestionManager extends ArrayList {

    private ArrayList<Question> questions;

    int counter = 1;

    public QuestionManager(ArrayList<String> texts){
        questions = textToQuestion(texts);
    }

    public ArrayList<Question> getAll(){
        return questions;
    }

    private ArrayList<Question> textToQuestion(ArrayList<String> texts){
        ArrayList<Question> q = new ArrayList<Question>();

        for(String string : texts){
            String[] line = string.split("\\s+");
            try {
                Question question = new Question(line[0], line[1]);
                q.add(question);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e + ": 空白行を消して再度お試しください。");
            }
        }

        return q;
    }

    public void shuffle(){
        ArrayList<Question> newList = new ArrayList<>(questions);

        //set int
        Integer[] range = new Integer[newList.size()];
        for(int i=0; i < newList.size(); i++){
            range[i] = i;
        }

        boolean ok = false;

        while (!ok){

            ok = true;

            //shuffle int
            Collections.shuffle(Arrays.asList(range));

            for(int n = 0; n < range.length - 1; n++){
                newList.set(n, questions.get(range[n]));
                n += 1;
            }

            //check continuation
            String temp = "";
            for(Question q : newList){
                if(temp.equals(q.getAnswer())){
                    ok = false;
                    break;
                }else{
                    temp = q.getAnswer();
                }
            }
        }

        questions = newList;
    }

}
