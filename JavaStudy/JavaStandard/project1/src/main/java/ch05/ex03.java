package ch05;

import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        //int[][] score = new int[4][3]; // 4행 3열 2차원 배열
        int[][] score = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        for(int i = 0; i < score.length; i++) {
            System.out.println(Arrays.toString(score[i]));
        }
    }

}
