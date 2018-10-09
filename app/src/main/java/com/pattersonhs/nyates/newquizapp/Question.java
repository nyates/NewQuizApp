package com.pattersonhs.nyates.newquizapp;

public class Question {
    int qTextId;
    boolean correctAnswer;

    public Question(int newQTextId, boolean newCorrectAnswer)
    {
        qTextId = newQTextId;
        correctAnswer = newCorrectAnswer;
    }

    public int getqTextId() {
        return qTextId;
    }

    public void setqTextId(int qTextId) {
        this.qTextId = qTextId;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
