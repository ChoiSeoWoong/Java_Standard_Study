package ch07;

class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Child2 extends Parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

public class ch07_ex04 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();

        Child2 c2 = new Child2();
        c2.method();
    }
}
