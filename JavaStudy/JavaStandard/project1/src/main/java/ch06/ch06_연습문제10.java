package ch06;

import java.util.Arrays;

public class ch06_연습문제10 {
    static int max(int[] arr) {
        int maxValue = 0;

        if(arr == null || arr.length == 0)
            return -999999;

        for(int i = 0; i < arr.length; i++) {
            if(maxValue < arr[i])
                maxValue = arr[i];
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[] {}));
    }
}
