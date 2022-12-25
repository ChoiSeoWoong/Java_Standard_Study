package ch08;

public class ch08_ex02 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); // 예외 발생
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if(ae instanceof ArithmeticException)
                System.out.println("True");
            System.out.println("ArithmeticException");
        } catch (Exception e) { // ArithmeticException을 제외한 모든 예외가 처리된다.
            System.out.println("Exception");
        } // ArithmeticException을 제외한 다른 예외가 발생하지 않았기 때문에 Exception 블럭은 실행되지 않는다.
        System.out.println(6);
    }
}
