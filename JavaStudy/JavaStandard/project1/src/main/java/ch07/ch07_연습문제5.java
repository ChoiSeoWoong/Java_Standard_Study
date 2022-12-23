package ch07;

class Outer3 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(Inner.this.value);
            System.out.println(Outer3.this.value);
        }
    } // Inner 클래스의 끝
} // Outer 클래스의 끝

public class ch07_연습문제5 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.Inner oi = o.new Inner();
        oi.method1();
    }
}
