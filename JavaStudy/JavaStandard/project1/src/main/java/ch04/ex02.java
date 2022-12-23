package ch04;

public class ex02 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            System.out.println(Math.random()); // 0.0 <= 값 < 1.0
            System.out.println((int)(Math.random() * 10) + 1);
        }
    }
}
