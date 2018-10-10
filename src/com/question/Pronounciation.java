package com.question;

public class Pronounciation extends Question {
    private String type;

    public Pronounciation(String text, String type) {
        super(text);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
