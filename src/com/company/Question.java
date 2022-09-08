package com.company;

import java.util.ArrayList;

public abstract class Question {

    private String questionText;
    private ArrayList correctAnswers;
    private ArrayList answerChoices;

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList getAnswerChoices() {
        return answerChoices;
    }
}
