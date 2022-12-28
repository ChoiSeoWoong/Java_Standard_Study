package ch12;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    void parentMethod() {} // 조상 메서드의 이름을 잘못 적었음.
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable {
    void test();
    //void check(); // 추상메서드
}

public class ch12_ex07 {

}
