package com.example.questions;public class Question {

    private int mquestion;
    private boolean manswer;
    public Question(int mquestion, boolean manswer) {
        this.mquestion = mquestion;
        this.manswer = manswer;
    }
    public int getTextResId() {
        return mquestion;
    }

    public boolean isAnswerTrue() {
        return manswer;
    }
}
