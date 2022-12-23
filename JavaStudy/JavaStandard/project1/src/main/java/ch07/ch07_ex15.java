package ch07;

class A {
//    public void method(B b) { 인터페이스를 사용하면 B를 C로 바꾸지 않아도 된다.
//
//    }
    public void method(I i) {
        i.method();
    }
}
// B클래스의 선언과 구현을 분리
interface I {
    public void method();
}

class B implements I{
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}

public class ch07_ex15 {
    public static void main(String[] args) {
        A a = new A();
        //a.method(new C()); //A가 C를 의존(사용)
        a.method(new B());
    }
}
