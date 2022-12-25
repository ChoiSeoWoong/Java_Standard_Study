package ch08;

public class ch08_ex01 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(0 / 0); // 0으로 나누어 ArithmeticException 고의로 발생
            System.out.println(2); // 실행되지 않는다. 예외 발생한 이후의 문장은 실행 X
        } catch (ArithmeticException ae) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
