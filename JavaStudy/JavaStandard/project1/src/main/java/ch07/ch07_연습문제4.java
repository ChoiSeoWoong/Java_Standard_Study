package ch07;

class Outer2 {
    static class Inner {
        int iv = 200;
    }
}

public class ch07_연습문제4 {
    public static void main(String[] args) {
        Outer2.Inner oi = new Outer2.Inner();
        System.out.println(oi.iv);
    }
}
