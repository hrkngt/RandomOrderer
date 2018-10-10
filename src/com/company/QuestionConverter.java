package com.company;

import com.question.Pronounciation;
import com.question.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class QuestionConverter {

    public static ArrayList<Pronounciation> textToPronounciation(ArrayList<String> lines){

        ArrayList<Pronounciation> questions = new ArrayList<Pronounciation>();

        for(String string : lines){
            String[] line = string.split("\\[|\\]");
            try {
                Pronounciation question = new Pronounciation(string, line[1]);
                questions.add(question);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e + ": 空白行を消して再度お試しください。");
            }
        }
        return questions;
    }

    public static ArrayList<Pronounciation> randomizePron(ArrayList<Pronounciation> originalList){

        ArrayList<Pronounciation> newList = originalList;
        //flush newList
//        for(int i=0; i < newList.size(); i++){
//            newList.set(i, new Pronounciation(null, null));
//        }

        int randomIndex;

        for (Pronounciation p : originalList) {
            randomIndex = new Random().nextInt(originalList.size());
//            System.out.println(newList.get(randomIndex).getText());

            if(newList.get(randomIndex).getType() == null){
                newList.set(randomIndex, new Pronounciation(p.getText(), p.getType()));
            }

        }


        return newList;
    }

}
