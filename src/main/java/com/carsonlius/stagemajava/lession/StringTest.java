package com.carsonlius.stagemajava.lession;


import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
       int[] scores = {89, 88};
       Score score = new Score(scores);
       score.printScores();

       scores[1] = 59;
       score.printScores();


    }
}

class Score {
    private final int[] scores;
    public Score(int[] scores) {
        this.scores = scores.clone();
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
