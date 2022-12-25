package ch08;

public class ch08_ex04 {
    public static void main(String[] args) {
        //throw new Exception(); // Exception을 고의로 발생 -> checked 예외
        throw new RuntimeException(); // RuntimeException을 고의로 발생 -> unchecked 예외
    }
}
