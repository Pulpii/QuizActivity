package com.example.geoquiz;

public class Question {
    private boolean mAnswerTrue;
    private int mTextResId;

    public Question(int mTextResId, boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }
}
