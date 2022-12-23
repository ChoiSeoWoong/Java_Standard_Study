package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        int[] scoreList = {1, 2, 3, 4, 5};

        for(int i = 0; i < scoreList.length; i++) {
            System.out.print(scoreList[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(scoreList));

    }
}
