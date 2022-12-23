package ch07;

class Outer {
    class Inner {
        int iv = 100;
    }
}

public class ch07_연습문제3 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi  = o.new Inner();
        System.out.println(oi.iv);
    }
}
