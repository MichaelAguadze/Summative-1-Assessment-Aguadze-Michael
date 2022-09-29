package com.company.Summative1AssessmentAguadzeMichael.models;

import java.util.Objects;

public class Answer {

    private int id;

    private MagicQuestion  question;


    private String answer;

    public Answer(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MagicQuestion getQuestion() {
        return question;
    }

    public void setQuestion(MagicQuestion question) {
        this.question = question;
    }


}
