package ch05;

import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2 = {
                {11, 12},
                {21, 22}
        };

        System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4]
        System.out.println(Arrays.deepToString(arr2)); //[[11, 12], [21, 22]]

        String[][] strArr = {
                {"하이", "룰루"},
                {"하삼", "롤로"}
        };

        String[][] strArr2 = {
                {"하이", "룰루"},
                {"하삼", "롤로"}
        };

        System.out.println(Arrays.equals(strArr, strArr2)); // False
        System.out.println(Arrays.deepEquals(strArr, strArr2)); // True

        int[] arr3 = Arrays.copyOf(arr, arr.length); // arr3 : [0, 1, 2, 3, 4]
        int[] arr4 = Arrays.copyOf(arr, 3); // arr4 : [0, 1, 2]
        int[] arr5 = Arrays.copyOf(arr, 7); // arr5 : [0, 1, 2, 3, 4, 0, 0]
        int[] arr6 = Arrays.copyOfRange(arr, 2, 4); // arr6 : [2, 3]
        int[] arr7 = Arrays.copyOfRange(arr, 0, 7); // arr7 : [0, 1, 2, 3, 4, 0, 0]

        int[] newArr = {3, 1, 2, 4, 5};
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
    }
}
