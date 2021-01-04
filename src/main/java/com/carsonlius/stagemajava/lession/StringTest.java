package com.carsonlius.stagemajava.lession;


import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
       int[] scores = {89, 88};
       Score score = new Score(scores);
       score.printScores();

       scores[1] = 59;
       score.printScores();

       // 观察string怎么避免这个问题的
//       new String("Hello");

        // 观察equals的实现
        "Hello".equals("aa");
    }
}

class Score {
    private final int[] scores;
    public Score(int[] scores) {

//        this.scores = scores.clone();
        this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
