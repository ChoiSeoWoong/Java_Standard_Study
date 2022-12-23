package ch05;

import java.util.Arrays;

public class 연습문제5 {
    public static void main(String[] args) {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for(int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[0];
            ballArr[0] = ballArr[j];
            ballArr[j] = tmp;
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball로 복사한다.
        ball3 = Arrays.copyOf(ballArr, 3);

        for(int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}
