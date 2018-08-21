package com.mateusz.lib;

import java.util.Random;

public class Jokes {

    private String[] mJokes;
    private Random mRandom;

    public Jokes(){
        mJokes = new String[2];
        mJokes[0] = "Can a kangaroo jump higher than a house? \n" +
                "-\n" +
                "Of course, a house doesn’t jump at all.\n" +
                "\n" +
                "Source: https://short-funny.com/";
        mJokes[1] = "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                "\n" +
                "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                "\n" +
                "Doctor: \"Nine.\"\n" +
                "\n" +
                "Source: https://short-funny.com/";
        mRandom = new Random();
    }

    public String[] getJokes() {
        return mJokes;
    }

    public String getJoke() {
        return mJokes[mRandom.nextInt(mJokes.length)];
    }
}
