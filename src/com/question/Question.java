package com.question;

public class Question {

    private String text;
    private String answer;

    public Question(String text, String answer){
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
