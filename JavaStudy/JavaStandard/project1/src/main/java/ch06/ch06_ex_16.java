package ch06;

public class ch06_ex_16 {
    static int[] arr = new int[10];

    static {
        for(int i = 0; i < arr.length; i++) {
            // 1부터 10까지의 임의의 값을 배열 arr에 저장
            arr[i] = (int)(Math.random() * 10) + 1;

        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
