package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Question {

    private String questionText;
    private ArrayList userSelection;
    private ArrayList correctAnswers;
    private ArrayList answerChoices;

    public Question(String questionText, ArrayList userSelection, ArrayList correctAnswers, ArrayList answerChoices) {
        this.questionText = questionText;
        this.userSelection = userSelection;
        this.correctAnswers = correctAnswers;
        this.answerChoices = answerChoices;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList getAnswerChoices() {
        return answerChoices;
    }

    public boolean isCorrect() {
        if (userSelection.equals(correctAnswers)) {
            return true;
        } else {
            return false;
        }
    }
}
